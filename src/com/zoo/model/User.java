package com.zoo.model;

public class User {
	public String id;
	private int logo;
	private String firstName;
	private String lastName;
	private boolean isActive;

	public User(String id, String firstName, String lastName, int logo, boolean isActive) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.logo = logo;
		this.isActive = isActive;
	}

	public int getPhoto() {
		return logo;
	}

	public void setPhoto(int photo) {
		this.logo = photo;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return logo + firstName + lastName + isActive;
	}

}
