 package ch04_prj1_SquaresAndCubesTable;

import java.util.Scanner;

public class SquaresAndCubesTable {

	public static void main(String[] args) {
		System.out.println("Welcome to the Table of Powers App!!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter a number: ");
			int n = sc.nextInt();
			
/*			String table = "";
 *			String row = "";
 *			String header = "Number\tSquared\tCubed";
 *			table += header;
 *			header = "======\t=======\t====="
 *			table + header;
*/			
			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");
			
			for (int i = 1; i <= n; i++) {
				int s = i * i;
				int c = i * i * i;
/*				row = i+"\t"+s+"\t"+c+"\n";
 * 				table += row;
 
 */
				System.out.println(i+"\t"+s+"\t"+c);
			}
			
		System.out.println("Continue: (y/n)");	
		choice = sc.next();
	}
		
		System.out.println("Bye");

}
}