/*
 * Order.java
 * Author: Jeffery Cubberley, Harrison Woodward
 * Submission Date: October 6th, 2016
 * Purpose: Testing program for PizzaStore and
 * corresponding programs demonstrating inheritance,
 * polymorphism, and encapsulation.
*/
package PizzaStore;

public abstract class Order implements PizzaStore 
{		
	private int Quantity;
	private double Price;
	private Pizza.PizzaType PizzaType;
	private Pizza.PizzaSize PizzaSize;
	
	public void setPrice(double price)
	{
		Price = price;
	}
	
	public double getPrice()
	{
		return Price;
	}
	
	public void setQuantity(int quantity)
	{
		Quantity = quantity;
	}
	
	public int getQuantity()
	{
		return Quantity;
	}
	
	public void setPizzaType(Pizza.PizzaType pizzaType)
	{
		PizzaType = pizzaType;
	}
	
	public Pizza.PizzaType getPizzaType()
	{
		return PizzaType;
	}
	
	public void setPizzaSize(Pizza.PizzaSize pizzaSize)
	{
		PizzaSize = pizzaSize;
	}
	
	public Pizza.PizzaSize getPizzaSize()
	{
		return PizzaSize;
	}
	
	public void printHeading(){}
	
	public void orderSummary(){}
	
	public void displayMenu()
	{
		System.out.println("Pizza: \t\tSmall \tMedium \tLarge");
		System.out.println("Vegetarian \t$" + PizzaStore.S_VEGETARIAN_PRICE + "\t$" 
											+ PizzaStore.M_VEGETARIAN_PRICE + "\t$"
											+ PizzaStore.L_VEGETARIAN_PRICE);
		System.out.println("Cheese \t\t$" 	+ PizzaStore.S_CHEESE_PRICE + "\t$" 
	    									+ PizzaStore.M_CHEESE_PRICE + "\t$"
	    									+ PizzaStore.L_CHEESE_PRICE);
	    System.out.println("Pepperoni \t$"  + PizzaStore.S_PEPPERONI_PRICE + "\t$" 
											+ PizzaStore.M_PEPPERONI_PRICE + "\t$"
											+ PizzaStore.L_PEPPERONI_PRICE + "\n");
	    System.out.println("Appetizers:");
	    System.out.println("Salad............................$" + PizzaStore.SALAD_PRICE);
	    System.out.println("Soup ............................$" + PizzaStore.SOUP_PRICE);
	    System.out.println("Soft Drinks .....................$" + PizzaStore.DRINK_PRICE + "\n");
	    	
	    System.out.println("Place your order:");
	}
}