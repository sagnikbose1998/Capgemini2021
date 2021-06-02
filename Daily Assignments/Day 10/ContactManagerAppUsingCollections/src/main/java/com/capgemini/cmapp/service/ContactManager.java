package com.capgemini.cmapp.service;
import java.util.Collection;
/**
 * 
 * @author Debanjan
 * 
 */
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.cmapp.model.Contact;

public class ContactManager {
	Map<String, Contact> contactList=new ConcurrentHashMap<String,Contact>();
	/*
	 * Constructor
	 */
	public ContactManager(){
		
	}
	
	/**
	 * Add contact method to add contacts in contact list object
	 * 
	 * @param firstName gets first name
	 * @param lastName gets last name
	 * @param phoneNo gets phone number
	 * 
	 */
	
	public void addContact(String firstName,String lastName,String phoneNo) {
		Contact contact=new Contact(firstName,lastName,phoneNo);
		
		validateContact(contact);
		checkIfAlreadyExists(contact);
		contactList.put(generateKey(contact), contact);
	}
	
	/**
	 * generateKey method generates key
	 * @param contact
	 * @return String
	 */
	private String generateKey(Contact contact) {
		
		return String.format("%s-%s", contact.getFname(), contact.getLname());
	}
	
	/**
	 *checkIfAlreadyExist method checks if contact already exists or not 
	 * @param contact
	 */
	private void checkIfAlreadyExists(Contact contact) {
		if (contactList.containsKey(generateKey(contact)))
			throw new RuntimeException("Contact Already Exists");
	}
	
	/**
	 * validateContact method validates the contact
	 * @param contact
	 */
	private void validateContact(Contact contact) {
		contact.validateFirstName();
		contact.validateLastName();
		contact.validatePhNo();
	}
	
	/**
	 * @return contactList
	 */
	public Collection<Contact> getAllContacts() {
		return contactList.values();
	}
}
