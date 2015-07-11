package com.work.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author kadir Pojo Person Class
 * Entity bean  with JPA annotations
 * Hibernate 
 *
 */


@Entity
@Table(name="Person")
public class Person {
    
	//Variables
	private int PersonId;
	private String FirstName;
	private String LastName;
	private String Age;
	private String Email;

	//===============================================
	// Create a Setters and Getters for all variables
	//===============================================
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public int getPersonId() {
		return PersonId;
	}

	public void setPersonId(int personId) {
		PersonId = personId;
	}

	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
