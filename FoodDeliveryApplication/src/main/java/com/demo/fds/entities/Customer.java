package com.demo.fds.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
    @GeneratedValue
	private int customerId;
	private String firstName;
	private String lastName;
	private String gender;
	private String age;
	private String mobileNumber;
	//private Address address;
	private String email;
	//constructors
	public Customer() {}
	public Customer(int customerId, String firstName, String lastName, String gender, String age,
			String mobileNumber, String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.mobileNumber = mobileNumber;
		//this.address = address;
		this.email = email;
	}
	//getter & setter
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	//public Address getAddress() {
	//	return address;
	//}
//	public void setAddress(Address address) {
	//	this.address = address;
//	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	// to string
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", age=" + age + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
	


}
