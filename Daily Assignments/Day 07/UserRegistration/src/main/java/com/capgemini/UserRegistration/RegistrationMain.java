package com.capgemini.UserRegistration;

public class RegistrationMain {

	public static void main(String[] args) {
		RegisterUser ru = new RegisterUser();
		ru.readDetails();
		System.out.println(ru.displayDetails());

	}

}
