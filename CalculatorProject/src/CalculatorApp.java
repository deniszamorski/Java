import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args)
	
	{
		System.out.println("Welcome to the Brainiac App");
		// declare a Scanner
		Scanner sc = new Scanner(System.in);
		
		// define 2 ints
		System.out.print("Enter int x:  ");
	int x = sc.nextInt();
		System.out.print("Enter int y:  ");
	int y = sc.nextInt();
	
		// define sum, diff, product, quotient
	int sum = x + y;
	int diff = x - y;
	int product = x * y;
	int quotient = x / y;
	
	System.out.println("Sum: "+sum);
	System.out.println("Diff: "+diff);
	System.out.println("Product: "+product);
	System.out.println("Quotient: "+quotient);
	
		System.out.println("Astalavista!");
	}

}
