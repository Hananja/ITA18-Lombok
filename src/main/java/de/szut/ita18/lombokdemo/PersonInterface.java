package de.szut.ita18.lombokdemo;

/** Interfaces geben die Schnittstelle für eine Klasse an
 */
public interface PersonInterface {
    void setAge(int age);
    String getFirstname();
    String getLastname();
    int getAge();
    void setFirstname(String firstname);
    void setLastname(String lastname);
}
