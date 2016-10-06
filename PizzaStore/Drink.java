/*
 * Drink.java
 * Author: Jeffery Cubberley, Harrison Woodward
 * Submission Date: October 6th, 2016
 * Purpose: Testing program for PizzaStore and
 * corresponding programs demonstrating inheritance,
 * polymorphism, and encapsulation.
*/
package PizzaStore;
import java.util.Scanner;

final class Drink extends CustomerOrder
{
	static int count = 0;
	private String drinkName = "Drink";
	
	public void displayMenu()
	{
		boolean isValid = true;
		
		while (isValid)
    	{
    		System.out.println("Enter quantity of item:");
    		Scanner scan = new Scanner(System.in);
	    	try
	    	{
		    	int quantity = scan.nextInt();
		
		    	if (quantity > 0)
		    	{
		    		setPrice(DRINK_PRICE);
		    		setQuantity(quantity);
		    		appendToOrder(drinkName, getPrice(), getQuantity(), getQuantity()*getPrice());
		    		total += getQuantity()*getPrice();
		    		count += getQuantity();
		    		noOfItems += getQuantity();
		    		isValid = false;
		    		orderSummary();
		    		super.displayMenu();
		    	}
	    	}
	    	catch (Exception InputMismatchException)
	    	{
	    		System.out.println("Invalid input. Try again.");
	    	}
    	}
	}
}
