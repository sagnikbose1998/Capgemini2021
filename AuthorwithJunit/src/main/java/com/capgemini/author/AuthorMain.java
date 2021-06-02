package com.capgemini.author;

import java.util.Collection;
import java.util.Scanner;

import com.capgemini.author.model.Author;
import com.capgemini.author.service.AuthorManager;


public class AuthorMain {
	static AuthorManager am = new AuthorManager();
	static Scanner sc = new Scanner(System.in);
	static String name;
	static String email;
	static char gender ;
	
	public static void main(String args[]) {
		
		char ch='y';
		while(ch=='y') {
		System.out.println("Enter the choice");
		String choice = sc.next();

		switch (choice) {
		case "readauthor":
			readAuthor();
			break;
		
		case "printdetails":
			Collection<Author> auth=am.getAllAuthors();
			System.out.println(auth);
			break;
			
			default:
				System.out.println("Wrong choice");
			}
		System.out.println("Do you want to continue (y/n)");
		ch=sc.next().trim().charAt(0);
		}
	}
	public static void readAuthor() {
		System.out.println("Enter name of author:");
		name=sc.next();
		
		System.out.println("Enter Email:");
		email=sc.next();
		
		System.out.println("Enter Gender: (m/f)");
		gender=sc.next().charAt(0);
	}
}
