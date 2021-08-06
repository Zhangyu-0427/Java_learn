package org.Zzzzzz.exer4;

public class Bank {

	private Customer[] customers;
	private int numberOfCustomer;
	
	public Bank(){
		customers = new Customer[10];
	}
	
	public void addCustomer(String f, String l){
		Customer tmp = new Customer(f, l);
		customers[numberOfCustomer++] = tmp;
	}
	
	public int getNumOfCustomers(){
		return numberOfCustomer;
	}
	
	public Customer getCustomer(int index){
		if(index >= 0 && index < numberOfCustomer){
			return customers[index];
		}
		
		return null;
	}
}
