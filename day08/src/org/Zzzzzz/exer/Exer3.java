package org.Zzzzzz.exer;

public class Exer3 {
	public static void main(String[] args) {
		
		Exer3 Test = new Exer3();
		
		Test.method();
	}
	
	public void method(){
		for(int i = 0; i < 10; i++){
			
			for(int j = 0; j < 8; j++){
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}
}
