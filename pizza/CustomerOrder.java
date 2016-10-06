/*
 * CustomerOrder.java
 * Author: Jeffery Cubberley, Harrison Woodward
 * Submission Date: October 6th, 2016
 * Purpose: Testing program for PizzaStore and
 * corresponding programs demonstrating inheritance,
 * polymorphism, and encapsulation.
*/
package PizzaStore;

public class CustomerOrder extends Order
{
	protected static double total;
	static int noOfItems = 0;
	static int count = 0;
	static String output = "";
	
	public void calculateTotal()
    {	
		total = total+(TAX*total);
    }
	
	public void orderSummary()
	{
		System.out.println("Order Summary");
		System.out.println("Item\t\t\tPrice\tQty");
    	System.out.println(output);
	}

    public void printInvoice()
    {
    	count++;
    	System.out.println("Invoice #" + count);
    	System.out.println("Item\t\t\tPrice\tQty");
    	System.out.println(output);
    }
    @Override
    public void displayMenu()
    {
    	System.out.println("Enter Choice (1-3) or hit any key to exit.");
    	System.out.println("1.) Pizza");
    	System.out.println("2.) Appetizers");
    	System.out.println("3.) Drinks");
    }
    
    public void appendToOrder(String name, double price, int quantity, double total)
    {
    	if (name.length() <= 7)
    	{
    		output += name + "\t\t\t$" + price +  "\t" + quantity + "\n";
    	}
    	else
    	{
	    	output += name + "\t$" + price +  "\t" + quantity + "\n";
    	}
    }

    public void printHeading()
    {
    	System.out.println("\tWelcome to Pizza Store");
    	super.displayMenu();
    }  
}