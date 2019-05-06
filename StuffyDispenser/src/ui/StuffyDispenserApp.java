package ui;

import java.util.ArrayList;
import java.util.List;

import business.Stuffy;
import util.Console;

public class StuffyDispenserApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser App!");
		System.out.println("This app will mimic the functionality of a stuffy dispensing machine.");
		
		//1st iteration - ArrayList
		
//		//Initialize a list of stuffies
//		Stuffy[] stuffies = new Stuffy [10];
		
		//2nd iteration - ArrayList
		List<Stuffy> stuffies = new ArrayList<>();
		stuffies.add(new Stuffy(1,"Dog","Blue","Large",4));
		stuffies.add(new Stuffy(2,"Cat","Green","Small",4));
		stuffies.add(new Stuffy(3,"Dragon","Purple","Medium",6));
		stuffies.add(new Stuffy(4,"Snail","Yellow","X-Large",1));
		stuffies.add(new Stuffy(5,"Platypus","Blue","Medium",4));
		stuffies.add(new Stuffy(6,"Octopus","Purple","Large",8));
		stuffies.add(new Stuffy(7,"Squirrel","Brown","Small",4));
		stuffies.add(new Stuffy(8,"Starfish","Pink","X-Large",5));
		stuffies.add(new Stuffy(9,"Lobster","Red","Large",10));
		stuffies.add(new Stuffy(10,"Spider","Clear","Small",8));
		
		
//		//Let's print the list of stuffies so user knows the indexes
//		for(int i = 0; i< stuffies.length; i++) {
//			System.out.println("Stuffy "+i+": "+stuffies[i]);
//		}
		for (Stuffy s: stuffies) {
			System.out.println(s);
		}
		
		//Loop until used wants to quit
		String choice = "";
		while (choice.equalsIgnoreCase("x")) {
			
		//Inside loop 
			
		choice = Console.getRequiredString(getMenuOptions());
		
		if (choice.equalsIgnoreCase("s")) {
			//1) Prompt user input ("Pick a stuffy")
			int selectionNbr = Console.getIntWithinRange("Pick a Stuffy by number (1-10): ", 0, 11);
			//selectionNbr --;
			
			Stuffy selectedStuffy = null;
			for (Stuffy s: stuffies) {
				//compare id to selection#
				if(s.getId()==selectionNbr) {
					selectedStuffy = s;
			
				}
			}
			//3) Display the selected stuffy
			System.out.println("Congratulations, you have a " +selectedStuffy.getSize() + ", " + selectedStuffy.getColor() + " " + selectedStuffy.getType());
			
 		}
		else if (choice.equalsIgnoreCase("a")) {
			//add a stuffy
			int id = Console.getInt("Stuffy ID:  ");
			String t = Console.getRequiredString("Stuffy Type:  ");
			String c = Console.getRequiredString("Stuffy Color: ");
			String s = Console.getRequiredString("Stuffy Size:  ");
			int l = 
		}
		
		
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
