package com.scheduler.backend.model;

import java.util.Objects;

public class Person extends Entity {

	private String firstName;
	private String lastName;
	private PersonType type;
	private Long calendarId;

	public Person() {
	}

	public Person(String firstName, String lastName, PersonType type) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
	}

	public Person(String firstName, String lastName, PersonType type, Long calendarId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.calendarId = calendarId;
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
	public PersonType getType() {
		return type;
	}
	public void setType(PersonType type) {
		this.type = type;
	}
	public Long getCalendarId() {
		return calendarId;
	}
	public void setCalendarId(Long calendarId) {
		this.calendarId = calendarId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Person)) return false;
		Person person = (Person) o;
		return getFirstName().equals(person.getFirstName()) &&
				getLastName().equals(person.getLastName()) &&
				getType() == person.getType() &&
				Objects.equals(getCalendarId(), person.getCalendarId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getFirstName(), getLastName(), getType(), getCalendarId());
	}
}
