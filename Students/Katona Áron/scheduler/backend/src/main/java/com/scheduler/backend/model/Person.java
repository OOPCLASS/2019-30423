package com.scheduler.backend.model;

public class Person extends Entity {
    private PersonType type;
    private String firstName;
    private String lastName;

    public Person(Long id, PersonType type, String firstName, String lastName) {
        super(id);
        this.type = type;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonType getType() {
        return type;
    }

    public void setType(PersonType type) {
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
