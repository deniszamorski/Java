import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays
        
        String[] monthName = {"January", "February", 
        		"March", "April", "May",
        		"June", "July", "August",
        		"September", "October", "November", 
        		"December"};
        
        Double[] monthSales = {101.37, 99.87, 105.34, 109.43, 117.16, 136.32, 153.12, 142.32, 203.32, 434.12, 543.43, 743.43};
        
        
        
        


        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month    
            // and display the month name and sales            
            System.out.println(monthSales[monthNumber -1]);
            System.out.println(monthName[monthNumber -1]);

            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // display the total sales for the year
        double total = 0.0;
        		for (int i = 0; i < monthSales.length; i++) {
        			total += monthSales[i];
        		}
       System.out.println("Total Sales: " + currency.format(total));
        Console.displayLine();
    }    

}
