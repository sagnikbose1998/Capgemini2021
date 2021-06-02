package com.capgemini.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterUser {
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String userName;
	private String password;
	
//	Constructors
	
	public RegisterUser() {}
	public RegisterUser(String firstName, String lastName, String mobileNumber, String userName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.userName = userName;
		this.password = password;
	}
	
//	Getters
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getMobileNumber() { return mobileNumber; }
	public String getUserName() { return userName; }
	public String getPassword() { return password; }
	
//	Setters
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }
	public void setUserName(String userName) { this.userName = userName; }
	public void setPassword(String password) { this.password = password; }
	
//	Methods
	public String validateUserName(String userName) {
		String userpattern = "^[A-Za-z0-9]{1,}[._-]{1}[A-Za-z0-9]{1}(.+){3,}$";
		Pattern pattern = Pattern.compile(userpattern);
		Matcher matcher = pattern.matcher(userName);
		return !matcher.matches() ? "Username cannot be accepted" : "Username is accepted"; 
		}
	public String validatePassword(String password) { return (password.length() < 8 || password.length() > 16) ? "Password cannot be accepted" : "Password is accepted"; }
	public void readDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user details");
		System.out.print("Enter the first name: ");
		firstName = sc.nextLine();
		System.out.print("Enter the last name: ");
		lastName = sc.nextLine();
		System.out.print("Enter mobile number: ");
		mobileNumber = sc.nextLine();
		System.out.print("Enter user name: ");
		System.out.println(validateUserName(userName = sc.nextLine()));
		System.out.print("Enter pass word: ");
		System.out.println(validatePassword(password = sc.nextLine()));
		sc.close();
		
	}
	public String displayDetails() {
		return "The details are:\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nMobile Number: " + mobileNumber + "\nUser Name: " + userName + "\nPassword: " + password;
	}
	
}
