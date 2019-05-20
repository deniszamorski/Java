package ui;

import java.util.ArrayList;
import java.util.List;
import business.Contact;
import business.TestContact;

public class LambdaDemoApp {

	public static void main(String[] args) {
		List<Contact> contacts = new ArrayList<>();

		System.out.println("Hello!");
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));

		// which contacts have no email address? - No Lambda
		List<Contact> contactsWithoutEmail = new ArrayList<Contact>();
		for (Contact c : contacts) {
			// does this contact match the criteria?
			if (c.getEmail() == null) {
				contactsWithoutEmail.add(c);
			}
		}

		System.out.println("Contacts with no email (no lambda): ");
		for (Contact c : contactsWithoutEmail) {
			System.out.println(c);
		}

		// Contacts with no phone# - no lambda
		List<Contact> contactsWithoutPhone = new ArrayList<Contact>();
		for (Contact c : contacts) {
			// does this contact match the criteria?
			if (c.getPhone() == null) {
				contactsWithoutPhone.add(c);
			}
		}

		System.out.println("Contacts with no phone(no lambda):");
		for (Contact c : contactsWithoutPhone) {
			System.out.println(c);
		}
		System.out.println("Lambdas!!!!");
		System.out.println("Contacts w/ no email:");
		contactsWithoutEmail = filterContacts(contacts, c-> c.getEmail()==null);
		for (Contact c : contactsWithoutEmail) {
			System.out.println(c);
		}
		
		System.out.println("Bye!");
	}
	
	private static List<Contact> filterContacts(List<Contact> contacts, TestContact condition) {
		List<Contact> filteredContacts = new ArrayList<>();
		for (Contact c: contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}
}
