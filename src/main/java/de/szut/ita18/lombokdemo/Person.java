package de.szut.ita18.lombokdemo;

import lombok.Data;
import lombok.NonNull;

@Data
public class Person implements PersonInterface {
    @NonNull private String firstname;
    @NonNull private String lastname;
    @NonNull private int age;

    // ändert den Default von Lombok (kann entfallen)
    Person(String firstname, String lastname, int age) {
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setAge(age);
    }

    // ändert den Default von Lombok: keine negativen Altersangaben (kann entfallen, falls unnötig)
    public void setAge(int age) {
        if( age < 0 ) {
            throw new IllegalArgumentException();
        }
        this.age = age;
    }
}
