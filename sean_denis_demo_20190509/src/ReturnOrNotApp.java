import java.util.Scanner;

public class ReturnOrNotApp {
	
	static int a = 0;

	public static void main(String[] args) {
		System.out.println("hi");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter some text: ");
		String str = sc.nextLine();
		
		//System.out.println("You entered:  '"+str+"'");
		// main method doesn't need anything in return from printToConsole...
		printToConsole(str);
		
		System.out.println("a = "+a);
		System.out.print("Enter a new value for a:  ");
		int userInt = sc.nextInt();
		setA(userInt);
		System.out.println("new value of a = "+a);
		System.out.println("bye");

	}
	
	private static void printToConsole(String s) {
		System.out.println("You entered:  '"+s+"'");
	}
	
	private static void setA(int n) {
		a = n;
	}

}
