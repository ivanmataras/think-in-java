package ru.ivanmataras.education.chapter17;

import java.time.LocalDate;
import java.util.Objects;

class Person implements Comparable<Person> {

    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dateOfBirth;

    Person() {
    }

    public Person(int id, String firstName, String middleName, String lastName, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getMiddleName() {
        return middleName;
    }

    void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && firstName.equals(person.firstName) && middleName.equals(person.middleName) && lastName.equals(person.lastName) && dateOfBirth.equals(person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public int compareTo(Person o) {

        int result = Integer.compare(id, o.getId());

        if (result == 0) {
            result = firstName.compareTo(o.getFirstName());
        }

        if (result == 0) {
            result = firstName.compareTo(o.getFirstName());
        }

        if (result == 0) {
            result = middleName.compareTo(o.getMiddleName());
        }

        if (result == 0) {
            result = lastName.compareTo(o.getLastName());
        }

        if (result == 0) {
            result = dateOfBirth.compareTo(o.getDateOfBirth());
        }

        return result;

    }

}