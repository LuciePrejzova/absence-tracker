package com.FLsolutions.absenceTracker.models;

import jakarta.persistence.*;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sysId;
	private String firstName;
	private String lastName;
	private String telNumber;
	private String email;
	
	private String userName;
	private String password;
	
	public User() {}
	
	public User(String firstName, String lastName, String telNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
		this.email = email;
		
		this.userName = firstName + lastName;
		//method to create safe password to be done
		this.password = "password";
    }
	
	public Long getSysId() {
		return sysId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getTelNumber() {
		return telNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

}
