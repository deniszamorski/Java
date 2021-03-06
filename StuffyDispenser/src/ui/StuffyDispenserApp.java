package ui;

import java.util.ArrayList;
import java.util.List;

import business.Stuffy;
import util.Console;

public class StuffyDispenserApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser App!");
		System.out.println("This app will mimic the functionality of a stuffy dispensing machine. "
				+ "The user will be able to select a Stuffy, and hopefully the app will return one! ");

		
		// Initialize a list of stuffies
//		Stuffy[] stuffies = new Stuffy[10];		
//		stuffies[0] = new Stuffy(1,"Dog","Blue","Large",4);
//		stuffies[1] = new Stuffy(2,"Cat","Green","Small",4);
//		stuffies[2] = new Stuffy(3,"Dragon","Purple","Medium",4);
//		stuffies[3] = new Stuffy(4,"Snail","Yellow","X-Large",1);
//		stuffies[4] = new Stuffy(5,"Platipus","Cyan","Medium",4);
//		stuffies[5] = new Stuffy(6,"Octopus","Purple","Large",8);
//		stuffies[6] = new Stuffy(7,"Squirrel","Brown","Small",4);
//		stuffies[7] = new Stuffy(8,"Starfish","Pink","X-Large",5);
//		stuffies[8] = new Stuffy(9,"Lobster","Red","Large",10);
//		stuffies[9] = new Stuffy(10,"Spider","Clear","Small",8);
		
		// Lets print the list of stuffies so user knows the indexes
//		for (int i = 0; i < stuffies.length; i++) {
//			System.out.println("Stuffy "+i+":"+stuffies[i]);
//			
//		}
		
		//2nd iteration - ArrayList
		List<Stuffy> stuffies = new ArrayList<>();
		stuffies.add(new Stuffy(1,"Dog","Blue","Large",4));
		stuffies.add(new Stuffy(2,"Cat","Green","Small",4));
		stuffies.add(new Stuffy(3,"Dragon","Purple","Medium",4));
		stuffies.add(new Stuffy(4,"Snail","Yellow","X-Large",1));
		stuffies.add(new Stuffy(5,"Platipus","Cyan","Medium",4));
		stuffies.add(new Stuffy(6,"Octopus","Purple","Large",8));
		stuffies.add(new Stuffy(7,"Squirrel","Brown","Small",4));
		stuffies.add(new Stuffy(8,"Starfish","Pink","X-Large",5));
		stuffies.add(new Stuffy(9,"Lobster","Red","Large",10));
		stuffies.add(new Stuffy(10,"Spider","Clear","Small",8));

//		for (Stuffy s: stuffies) {
//			System.out.println(s);
//		}
		
		// Loop until user wants to quit
		String choice = Console.getRequiredString(getMenuOptions());
		
		
		while (!choice.equalsIgnoreCase("x")) {
			// Inside loop
			
			if (choice.equalsIgnoreCase("s")) {
				// 1) Prompt for user input ("Pick a stuffy")
				int selectionNbr = Console.getIntWithinRange("Pick a stuffy by number (1-10): ", 0, 11);
//				selectionNbr--;
				
				// 2) Do business logic (retrieve a stuffy from the list)
//				Stuffy selectedStuffy = stuffies[selectionNbr];
				Stuffy selectedStuffy = null;
				for (Stuffy s: stuffies) {
					// compare id to selection number
					if(s.getId()==selectionNbr) {
						// that's our stuffy
						selectedStuffy = s;
					}
				}
				
				
				// 3) Display the selected stuffy
				System.out.println("Congratulations, you have a "+selectedStuffy.getSize()+" "+selectedStuffy.getColor()+
						" "+selectedStuffy.getType()+" stuffy!!!!\n");				
				
				choice = Console.getRequiredString(getMenuOptions());

			}
			else if (choice.equalsIgnoreCase("a")) {
				// add a stuffy
				int id = Console.getInt("Stuffy ID: ");
				String t = Console.getRequiredString("Stuffy Type: ");
				String c = Console.getRequiredString("Stuffy Color: ");
				String s = Console.getRequiredString("Stuffy Size: ");
				int l = Console.getInt("Stuffy # limbs: ");
				Stuffy stuffy = new Stuffy(id,t,c,s,l);
				stuffies.add(stuffy);
				
				choice = Console.getRequiredString(getMenuOptions());
			}
			
//			// 4) Prompt to continue
//			choice = Console.getChoiceString("Continue? (y/n) ", "y", "n");
			
		}
		
		
		
		
		System.out.println("Bye!");
	}
	
	private static String getMenuOptions() {
		String s = "Menu Options\n" +
					"S - Search for a Stuffy\n" +
					"A - Add a Stuffy\n" +
					"X - Exit\n";
		return s;
		
	}

}
