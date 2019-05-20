package com.prs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prs.business.Product;
import com.prs.business.PurchaseRequest;
import com.prs.business.PurchaseRequestLineItem;
import com.prs.business.User;
import com.prs.business.Vendor;
import com.prs.db.ProductDB;
import com.prs.db.PurchaseRequestDB;
import com.prs.db.PurchaseRequestLineItemDB;
import com.prs.db.UserDB;
import com.prs.db.VendorDB;
import com.prs.util.Console;

@SpringBootApplication
public class PrsJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrsJpaDemoApplication.class, args);
		System.out.println("Hello");
		
		String choice = Console.getRequiredString(getMenuOptions());
		
		while (!choice.equalsIgnoreCase("x")) {

			if (choice.equalsIgnoreCase("U")) {
				List<User> users = UserDB.getAll();
				if (users != null) {
					for (User u : users) {
						System.out.println(u);
					}
				} else {
					System.out.println("users null");
				}
				choice = Console.getRequiredString(getMenuOptions());
			}
				else if (choice.equalsIgnoreCase("V")) { 
					List<Vendor> vendors = VendorDB.getAll();
					if (vendors != null) {
						for (Vendor v : vendors) {
							System.out.println(v);
						}
					} else {					
						System.out.println("vendors null");
					}
				choice = Console.getRequiredString(getMenuOptions());
				}
				else if (choice.equalsIgnoreCase("P")) { 
					List<Product> products = ProductDB.getAll();
					if (products != null) {
						for (Product p : products) {
							System.out.println(p);
						}
					} else {					
						System.out.println("products null");
					}
				choice = Console.getRequiredString(getMenuOptions());
				}
				else if (choice.equalsIgnoreCase("PR")) { 
					List<PurchaseRequest> purchaseRequests = PurchaseRequestDB.getAll();
					if (purchaseRequests != null) {
						for (PurchaseRequest pr : purchaseRequests) {
							System.out.println(pr);
						}
					} else {					
						System.out.println("pruchase requests null");
					}
				choice = Console.getRequiredString(getMenuOptions());
				}
				else if (choice.equalsIgnoreCase("V")) { 
					List<Vendor> vendors = VendorDB.getAll();
					if (vendors != null) {
						for (Vendor v : vendors) {
							System.out.println(v);
						}
					} else {					
						System.out.println("vendors null");
					}
				choice = Console.getRequiredString(getMenuOptions());
				} else if (choice.equalsIgnoreCase("PRLN")) { 
					List<PurchaseRequestLineItem> prln = PurchaseRequestLineItemDB.getAll();
					if (prln != null) {
						for (PurchaseRequestLineItem p : prln) {
							System.out.println(p);
						}
					} else {					
						System.out.println("purchase request line items null");
					}
				choice = Console.getRequiredString(getMenuOptions());
				}
			}
			choice = Console.getRequiredString(getMenuOptions());
		
		
		System.out.println("Bye");
	}
	private static String getMenuOptions() {
		String s = "Menu Options\n" +
					"U - List Users \n" +
					"V - List Vendors \n" +
					"P - List Products \n" +
					"PR - List Purchase Requests \n" +
					"PRLN - List Purchase Requests Line Items \n" +
					"Add - \n" +
					"Delete - \n" +
					"Update - \n" +
					"X - Exit\n";
		return s;

	}
}
