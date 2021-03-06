import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println(); // print a blank line
		
		Scanner sc = new Scanner(System.in);
		
		// perform calculations until choice isn't equal to "y" or "Y"
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the length measurement from the user
			System.out.println("Enter length:  ");
			double length = sc.nextDouble();
			
			// get the width measurement from the user
			System.out.println("Enter width:  ");
			double width = sc.nextDouble();
			
			// calculate the area and perimeter
			double area		 = length * width;
			double perimeter = 2 * width + 2 * length;
			
			// display the results
			String message = "Area: " 		+ area + "\n"
						   + "Perimeter"	+ perimeter + "\n";
			System.out.println(message);
			
			// see if the user wants to continue
			
		System.out.println("Continue? (y/n: ");
		choice = sc.next();
		System.out.println();
		}
		System.out.println("Bye!");
	} 

}
