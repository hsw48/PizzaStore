/*
 * PizzaStore.java
 * Author: Jeffery Cubberley, Harrison Woodward
 * Submission Date: October 6th, 2016
 * Purpose: Testing program for PizzaStore and
 * corresponding programs demonstrating inheritance,
 * polymorphism, and encapsulation.
*/
package PizzaStore;

public interface PizzaStore
{
	final double TAX = 0.07;
	final double S_CHEESE_PRICE = 5.50;
	final double M_CHEESE_PRICE = 8.00;
	final double L_CHEESE_PRICE = 10.00;
	final double S_PEPPERONI_PRICE = 6.00;
	final double M_PEPPERONI_PRICE = 8.50;
	final double L_PEPPERONI_PRICE = 12.00;
	final double S_VEGETARIAN_PRICE = 6.50;
	final double M_VEGETARIAN_PRICE = 10.50;
	final double L_VEGETARIAN_PRICE = 13.50;
	final double DRINK_PRICE = 2.00;
	final double SALAD_PRICE = 4.50;
	final double SOUP_PRICE = 5.00;

	public void calculateTotal();  
	public void displayMenu();
	public void printInvoice();
	public void printHeading();
}