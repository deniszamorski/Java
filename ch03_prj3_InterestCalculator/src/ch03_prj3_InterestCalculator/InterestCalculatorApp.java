package ch03_prj3_InterestCalculator;

import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// Hello part
			System.out.println("Welcome To The Interest Calculator!");

			// Input values
			System.out.println("Enter loan amount: ");
			//EDITED OUT
			//double loanAmount = sc.nextDouble();
			
			
			String loanAmtStr = sc.next();
			BigDecimal loanAmt = new BigDecimal(loanAmtStr);
			loanAmt = loanAmt.setScale(2,RoundingMode.HALF_UP);
			
			
		System.out.println("Enter interest rate: ");
		String intRateStr = sc.next();
		BigDecimal intRate = new BigDecimal(intRateStr);
		
			
			
			
			
			
			//EDITED OUT
			//double interestRate = sc.nextDouble();
			
			
			
			
			//EDITED OUT
			//interestRate = interestRate / 100;
			
			// Calculate Business Logic
				BigDecimal intAmt = loanAmt.multiply(intRate);
			
					//EDITED OUT
			//BigDecimal decimalLoanAmount = new BigDecimal(Double.toString(loanAmount)).setScale(2, RoundingMode.HALF_UP);
			// BigDecimal decimalInterestRate = new BigDecimal(Double.toString(interestRate)).setScale(3,RoundingMode.HALF_UP);
			//BigDecimal decimalInterest = new BigDecimal(Double.toString(interestCalc)).setScale(2,RoundingMode.HALF_UP);

			// Display results

			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);
			
			String Message = 
					"Loan Amount: " + currency.format(loanAmt) + "\n"
				  + "Interest Rate: " + percent.format(intRate) + "\n" 
			      + "Interest: " + currency.format(intAmt) + "\n";

			System.out.println(Message);
			System.out.println("Continue? y/n: ");
			choice = sc.next();

		}
		// Goodbye
		System.out.println("Astalavista!");

	}

}
