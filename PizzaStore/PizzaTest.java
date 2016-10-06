/*
 * PizzaTest.java
 * Author: Jeffery Cubberley, Harrison Woodward
 * Submission Date: October 6th, 2016
 * Purpose: Testing program for PizzaStore and
 * corresponding programs demonstrating inheritance,
 * polymorphism, and encapsulation.
*/
package PizzaStore;
import java.util.Scanner;

public class PizzaTest
{
	public static void main(String[] args)
    {
		boolean outerLoop = true;
		while (outerLoop)
		{	
			boolean isLoop = true;
			Order placeOrder = new CustomerOrder();
			placeOrder.printHeading();
			
			Scanner scan = new Scanner(System.in);
			char response;
			
		    while (isLoop)
			{ 
		    	boolean isValid = true;
		    	boolean newOrder = true;
		    	
	        	placeOrder.displayMenu();
	        	response = scan.next().charAt(0);
	        	
		        if (response == '1')
		        {
		        	placeOrder = new Pizza();
		        }
		        		
        		else if (response == '2')
        		{
        			placeOrder = new Appetizers();
        		}
        		
        		else if (response == '3')
        		{
        			placeOrder = new Drink();
        		}
        		
        		else
        		{	
		    		placeOrder.orderSummary();
		    		
		    		while (isValid)
		    		{
		    			System.out.println("Add more items(Y for Yes, N for No)?");
			    		response = scan.next().charAt(0);
			    		
		    			if (response == 'Y' || response == 'y')
		    			{
		    				isValid = false;
		    			}
		    			
		    			else if (response == 'N' || response == 'n')
		    			{
		    				isValid = false;
		    				placeOrder.printInvoice();
		    				CustomerOrder.output = "";
		    				
		    				System.out.println("Total Sales \t\t $" + CustomerOrder.total);
	    					System.out.println("Tax \t\t\t $" + CustomerOrder.total*PizzaStore.TAX);
	    					placeOrder.calculateTotal();
	    					System.out.println("Total \t\t\t $" + CustomerOrder.total + "\n");
		    				
		    				while (newOrder)
		    				{	
		    					System.out.println("System Off (Enter N for new customer or E to exit)");
		    					response = scan.next().charAt(0);
		    					
		    					if (response == 'E' || response == 'e')
		    					{
		    						System.out.println("Session Sales Summary:");
		    		        		System.out.println("Total Number of Orders: \t" + CustomerOrder.count);
		    		        		System.out.println("Total Number of Pizza Orders: \t" + Pizza.count);
		            				System.out.println("Total Number of Appetizers: \t" + Appetizers.count);
		            				System.out.println("Total Number of Drink Orders: \t" + Drink.count);
		            				System.exit(0);
		    					}
		    					else if (response == 'N' || response == 'n')
		    					{
		    						CustomerOrder.total = 0;
		    						newOrder = false;
		    						isLoop = false;
		    					}
		    					else
		    					{
		    						System.out.println("Invalid input, try again.");
		    					}
		    				}
		    			}
		    			else
		    			{
		    				System.out.println("Invalid input, try again.");
		    			}
		    		}
        		}
			}
		}
    }
}