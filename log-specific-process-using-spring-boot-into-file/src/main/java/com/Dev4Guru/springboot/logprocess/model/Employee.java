package com.Dev4Guru.springboot.logprocess.model;

/**
 * @author Guru Ganesh CH
 *
 */
public class Employee {
	private String id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String username;

	@Override
	public String toString() {
		return "Employee{" + "id='" + id + '\'' + ", firstName='" + firstName + '\'' + ", middleName='" + middleName
				+ '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", username='" + username
				+ '\'' + '}';
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
