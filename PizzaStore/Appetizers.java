/*
 * Appetizers.java
 * Author: Jeffery Cubberley, Harrison Woodward
 * Submission Date: October 6th, 2016
 * Purpose: Testing program for PizzaStore and
 * corresponding programs demonstrating inheritance,
 * polymorphism, and encapsulation.
*/
package PizzaStore;
import java.util.Scanner;

final class Appetizers extends CustomerOrder
{
	static int count = 0;
	private ApptType apptType;
	private String apptName;
	
	public enum ApptType
	{
		SOUP, SALAD
	}
	
	public void displayMenu()
	{
		boolean isValid = true;
		
		System.out.println("Enter Appetizer choice (1-2) or hit any key to exit.");
    	System.out.println("1.) Salad");
    	System.out.println("2.) Soup");
    	
    	Scanner scan = new Scanner(System.in);
    	char response = scan.next().charAt(0);
    	boolean runNext = true;
    	
    	switch(response) 
    	{
    		case '1': 
    			apptName = ApptType.SALAD.name();
    			apptName = apptName.substring(0,1) + apptName.substring(1).toLowerCase();
    			apptType = ApptType.SALAD;
    			break;
    		
    		case '2': 
    			apptName = ApptType.SOUP.name();
    			apptName = apptName.substring(0,1) + apptName.substring(1).toLowerCase();
    			apptType = ApptType.SOUP;
    			break;
    		default: 
    			runNext = false; 
    			orderSummary();
    			super.displayMenu();
    	}
    	
    	if (runNext == true)
    	{
    		if (apptType == ApptType.SOUP)
        	{
        		setPrice(SOUP_PRICE);
        	}
        	else if (apptType == ApptType.SALAD)
        	{
        		setPrice(SALAD_PRICE);
        	}
    		
	    	while (isValid)
	    	{
	    		System.out.println("Enter quantity of item:");
	    		Scanner scan2 = new Scanner(System.in);
	    		try
		    	{
	    			int quantity = scan2.nextInt();
		    	
			    	if (quantity > 0)
			    	{
			    		setQuantity(quantity);
			    		appendToOrder(apptName, getPrice(), getQuantity(), getQuantity()*getPrice());
			    		total += getQuantity()*getPrice();
			    		count += getQuantity();
			    		noOfItems += getQuantity();
			    		isValid = false;
			    		displayMenu();
			    	}
		    	}
		    	catch (Exception InputMismatchException)
		    	{
		    		System.out.println("Invalid input. Try again.");
		    	}
		    }
	    }
    }
}