package com.stacksimplify.restservices.Hello;

public class UserDetails {
	
	private String firstName;
	private String lastName;
	private String city;
	
	//FieldsConstructor
	public UserDetails(String firstName, String lastName, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}
	
	//Getter and Setter
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//To String
	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + "]";
	}
	
	
}