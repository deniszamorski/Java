package ch04_prj3_TipCalculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		
		//Hello
		System.out.println("Hello, welcome to this bombass app!");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		//User Input
			System.out.println("Cost of meal: ");
			BigDecimal cost = new BigDecimal(sc.next());
			System.out.println();
			
			//Number Format
			NumberFormat percentFormat = NumberFormat.getPercentInstance();
			NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();	  
			
			//Calculate tip - start at 15, stop at 25, increment by 5
			
			for (double percent = 0.15; percent <= 0.25; percent += 0.05) {
				
			//calculate tip total
			BigDecimal tip = new BigDecimal (Double.toString(percent));
			BigDecimal x = new BigDecimal (10);
			BigDecimal tipFormatted = tip.multiply(x);
			BigDecimal amount = cost.multiply(tip);
			BigDecimal total = amount.add(cost);
			
			//Display tip amount and total
			System.out.println(percentFormat.format(percent));
			System.out.println("Tip amount: " + currencyFormat.format(tipFormatted));
			System.out.println("Total amount: " + currencyFormat.format(total));
			
			}
			
			System.out.println("Do you want to continue? y/n");
			choice = sc.next();
			
	}
		
		//Bye
		System.out.println("Astalavista");
}
	}
