package com.superhero;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.superhero.business.superhero;
import com.superhero.business.supervillain;
import com.superhero.db.superherodb;
import com.superhero.db.supervillaindb;
import com.superhero.util.Console;

@SpringBootApplication
public class SuperheroJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperheroJpaDemoApplication.class, args);
		
		System.out.println("Hello there!");
		
		String choice = Console.getRequiredString(getMenuOptions());
		
		while (!choice.equalsIgnoreCase("x")) {

			if (choice.equalsIgnoreCase("Heroes")) {
				List<superhero> heroes = superherodb.getAll();
				if (heroes != null) {
					for (superhero h : heroes) {
						System.out.println(h);
					}
				} else {
					System.out.println("users null");
				}
				choice = Console.getRequiredString(getMenuOptions());
			} else if (choice.equalsIgnoreCase("Villains")) {
				List<supervillain> villains = supervillaindb.getAll();
				if (villains != null) {
					for (supervillain v : villains) {
						System.out.println(v);
					}
				} else {
					System.out.println("vendors null");
				}
				choice = Console.getRequiredString(getMenuOptions());
			}
			
		}
		System.out.println("Astalavista!");
		
	}

	private static String getMenuOptions() {
		String s = "Menu Options\n" + "Heroes - List Superheroes \n" + "Villains - List Supervillains \n" + "X - Exit\n";
		return s;
	}

}
