package org.Zzzzzz.java;

public class TransferTest {

	public static void main(String[] args) {
		String s1 = "hello";
		
		TransferTest test = new TransferTest();
		test.change(s1);
		
		System.out.println(s1);
	}
	
	public void change(String s){
		s = "hhh";
	}
	
}
