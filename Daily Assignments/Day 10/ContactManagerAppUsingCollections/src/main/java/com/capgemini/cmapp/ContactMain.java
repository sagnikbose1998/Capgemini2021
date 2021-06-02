package com.capgemini.cmapp;

import java.util.Collection;
import java.util.Scanner;

import com.capgemini.cmapp.model.Contact;
import com.capgemini.cmapp.service.ContactManager;

public class ContactMain {
	static Scanner ip = new Scanner(System.in);
	static String fname, lname, phno; 
	
	public static void main(String[] args) {
		ContactManager cm = new ContactManager();
		char choice = 'y';
		while (choice == 'y') {
			System.out.println("Enter the choice: ");
			System.out.println("a: add contact");
			System.out.println("g: get contact");
			System.out.println("f: find a contact");
			System.out.println("u: update a contact");
			System.out.println("d: delete a contact");
			char ch = ip.next().trim().charAt(0);
			switch (ch) {
			case 'a':
				readDetails();
				cm.addContact(fname, lname, phno);
				break;
			case 'g':
				Collection<Contact>data = cm.getAllContacts();
				System.out.println(data);
				break;
			case 'f':
				System.out.println("code here to find");
				break;
			case 'u':
				System.out.println("code here to update");
				break;
			case 'd':
				System.out.println("code here to delete");
				break;
			default:
				break;
			}
			System.out.println("Do you want to continue? ");
			choice = ip.next().trim().charAt(0);
		}
		ip.close();
	}

	private static void readDetails() {
		System.out.print("Enter the first name: ");
		fname = ip.next();
		System.out.print("Enter the last name: ");
		lname = ip.next();
		System.out.print("Enter the ph no: ");
		phno = ip.next();
	}
}
