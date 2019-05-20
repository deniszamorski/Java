package ui;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args)
		    {
		
				// Hello
				System.out.println("Hey there ;) !");
				
				
					Scanner sc=new Scanner(System.in);
					
					int fnum,snum,ans;
					char sign = 0;  // assign math operator
					
					
					String choice = "y";
					
					
					while (choice.equalsIgnoreCase("y")) {
					
						System.out.print("Enter first number: "); 
						
						fnum=sc.nextInt();
						
						System.out.print("Enter second number: ");
						snum=sc.nextInt();
						
						System.out.print("Enter the mathematical operator to be used: ");
						sign=sc.next().charAt(0); 
						if (sign == '+' ) //addition
						{
							ans=fnum + snum;
							System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
						}
						else if(sign == '-') // subtraction
						{
							ans=fnum-snum;
							System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
						}
						else if(sign == '/') // division
						{
							ans=fnum/snum;
							System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
						}
						else if(sign == '*') //multiplication
						{
							ans=fnum*snum;
							System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
						}
						else
							System.out.println("Your Input is not correct,please check it for any error(s).");
							
						System.out.println();

						
						
						System.out.println("Continue? (y/n): ");
						choice = sc.next();
						System.out.println("Astalavista!");
		        }
		 
		    

			}
		    

	}

