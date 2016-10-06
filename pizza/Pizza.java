/*
 * Pizza.java
 * Author: Jeffery Cubberley, Harrison Woodward
 * Submission Date: October 6th, 2016
 * Purpose: Testing program for PizzaStore and
 * corresponding programs demonstrating inheritance,
 * polymorphism, and encapsulation.
*/
package PizzaStore;
import java.util.Scanner;

final class Pizza extends CustomerOrder
{
	static int count = 0;
	private String pizzaName, temp;
	
	public enum PizzaType
	{
		CHEESE, PEPPERONI, VEGETARIAN
	}
	public enum PizzaSize
	{
		SMALL, MEDIUM, LARGE
	}
	
	public void displayMenu()
	{
		boolean isValid = true;
		
		System.out.println("Enter Pizza choice (1-3) or hit any key to exit.");
    	System.out.println("1.) Vegetarian");
    	System.out.println("2.) Cheese");
    	System.out.println("3.) Pepperoni");
    	
		Scanner scan = new Scanner(System.in);
		char response = scan.next().charAt(0);
		boolean runNext = true;
		
    	switch(response) 
    	{
    		case '1': 
    			temp = PizzaType.VEGETARIAN.name();
    			temp = temp.substring(0,1) + temp.substring(1).toLowerCase();
    			setPizzaType(PizzaType.VEGETARIAN);
    			break;
    		
    		case '2': 
    			temp = PizzaType.CHEESE.name();
    			temp = temp.substring(0,1) + temp.substring(1).toLowerCase();
    			setPizzaType(PizzaType.CHEESE);
    			break;
    		
    		case '3': 
    			temp = PizzaType.PEPPERONI.name();
    			temp = temp.substring(0,1) + temp.substring(1).toLowerCase();
    			setPizzaType(PizzaType.PEPPERONI);
    			break;
    		default:  
    			runNext = false; 
    			orderSummary();
    			super.displayMenu();
    	}
    	if (runNext == true)
		{	
	    	System.out.println("Enter Pizza size (1-3) or hit any key to exit.");
	    	System.out.println("1.) Small");
	    	System.out.println("2.) Medium");
	    	System.out.println("3.) Large");
	    	
	    	response = scan.next().charAt(0);
	
	    	switch(response) 
	    	{
	    		case '1': 
	    			setPizzaSize(PizzaSize.SMALL);
	    			pizzaName = PizzaSize.SMALL.name();
	    			pizzaName = pizzaName.substring(0,1) + pizzaName.substring(1).toLowerCase();
	    			pizzaName = pizzaName + " " + temp + " Pizza";
	    			break;
	    		
	    		case '2': 
	    			setPizzaSize(PizzaSize.MEDIUM);
	    			pizzaName = PizzaSize.MEDIUM.name();
	    			pizzaName = pizzaName.substring(0,1) + pizzaName.substring(1).toLowerCase();
	    			pizzaName = pizzaName + " " + temp + " Pizza";
	    			break;
	    		
	    		case '3': 
	    			setPizzaSize(PizzaSize.LARGE);
	    			pizzaName = PizzaSize.LARGE.name();
	    			pizzaName = pizzaName.substring(0,1) + pizzaName.substring(1).toLowerCase();
	    			pizzaName = pizzaName + " " + temp + " Pizza";
	    			break;
	    		default:	
	    			isValid = false; 
	    			orderSummary();
	    			super.displayMenu();
		    }
	    	
	    	if (getPizzaType() == PizzaType.VEGETARIAN )
	    	{
	    		if (getPizzaSize() == PizzaSize.SMALL)
	    		{
	    			setPrice(S_VEGETARIAN_PRICE);
	    		}
	    		
	    		else if (getPizzaSize() == PizzaSize.MEDIUM)
	    		{
	    			setPrice(M_VEGETARIAN_PRICE);
	    		}
	    		
	    		else if (getPizzaSize() == PizzaSize.LARGE)
	    		{
	    			setPrice(L_VEGETARIAN_PRICE);
	    		}
	    		
	    	}
	    	
	    	else if (getPizzaType() == PizzaType.CHEESE)
	    	{
	    		if (getPizzaSize() == PizzaSize.SMALL)
	    		{
	    			setPrice(S_CHEESE_PRICE);
	    		}
	    		
	    		else if (getPizzaSize() == PizzaSize.MEDIUM)
	    		{
	    			setPrice(M_CHEESE_PRICE);
	    		}
	    		
	    		else if (getPizzaSize() == PizzaSize.LARGE)
	    		{
	    			setPrice(L_CHEESE_PRICE);
	    		}	
	    	}
	    	
	    	else if (getPizzaType() == PizzaType.PEPPERONI)
	    	{
	    		if (getPizzaSize() == PizzaSize.SMALL)
	    		{
	    			setPrice(S_PEPPERONI_PRICE);
	    		}
	    		
	    		else if (getPizzaSize() == PizzaSize.MEDIUM)
	    		{
	    			setPrice(M_PEPPERONI_PRICE);
	    		}
	    		
	    		else if (getPizzaSize() == PizzaSize.LARGE)
	    		{
	    			setPrice(L_PEPPERONI_PRICE);
	    		}
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
			    		appendToOrder(pizzaName, getPrice(), getQuantity(), getQuantity()*getPrice());
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