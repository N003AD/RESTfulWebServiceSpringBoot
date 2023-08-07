package com.springboot.app;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private String adresse;

	public Student(String firstName, String lastName, int age, String adresse) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.adresse = adresse;
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
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
