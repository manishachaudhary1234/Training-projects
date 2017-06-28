package com.example.demo;

import java.io.Serializable;

public class May2017 implements Serializable{
    String firstName;
    String lastName;
    
    public May2017(String firstName, String lastName) {
    	super();
    	this.firstName=firstName;
    	this.lastName=lastName;
    	
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

	@Override
	public String toString() {
		return "May2017 [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}
