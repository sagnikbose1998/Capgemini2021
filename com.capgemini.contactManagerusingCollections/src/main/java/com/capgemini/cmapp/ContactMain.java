package com.capgemini.cmapp;

import java.util.Scanner;

import com.capgemini.cmapp.service.ContactManager;

public class ContactMain {
	static Scanner ip=new Scanner(System.in);
	
	static String fname;
	static String lname;
	static String phNo;
	public static void main(String[] args) {
		ContactManager cm=new ContactManager();
		
		System.out.println("enter the choice");
		char ch=ip.next().trim().charAt(0);
		
		char choice='y';
		while(choice=='y') {
		
		switch(ch) {
		case 'a':
			readDetails();
			cm.addContact(fname,lname,phNo);
			break;
			
		case 'g':
			cm.getAllContacts();
			
			break;
			
			default:
				
				break;
		}//switch close
		}//close while
		System.out.println("do you want to continue?");
		choice=ip.next().trim().charAt(0);
	}
	
	public static void readDetails() {
		System.out.println("Enter the contact details");
		System.out.println("enter the first name:");
		fname = ip.next();
		System.out.println("enter the last name:");
		lname=ip.next();
		System.out.println("enter the phone no");
		phNo=ip.next();
	}

}