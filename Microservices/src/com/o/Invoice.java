package com.o;

public class Invoice  {
	Book book;
	int quantity;
	double discountRate;
	double taxRate;
	double total;
	public Invoice(Book book, int quantity, double discountRate, double taxRate, double total) {
		super();
		this.book = book;
		this.quantity = quantity;
		this.discountRate = discountRate;
		this.taxRate = taxRate;
		this.total = total;
	}
	
	public double calculateTotal() {
		double price= ((book.price-book.price * discountRate)* this.quantity);
		double pricewithtaxes=price * (1+ taxRate);
		return pricewithtaxes;
	}
	
	
	public void printInvoice() {
		System.out.println(quantity + "x " + book.name + " " + book.price);
		System.out.println("Discount Rate: "+discountRate);
		System.out.println("Tax Rate: "+taxRate);
		System.out.println("Total: "+total);
	}
	
	public void saveToFile(String filename) {
		
	}

	
}
