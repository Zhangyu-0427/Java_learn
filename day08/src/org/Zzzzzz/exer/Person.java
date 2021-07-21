package org.Zzzzzz.exer;

public class Person {
	String name;
	int age;
	/**
	 * sex = 1; 男性
	 * sex = 0; 女性
	 */
	int sex;
	
	public void study(){
		System.out.println("studying");
	}
	
	public void showage(){
		System.out.println("age: " + age);
	}
	
	public int addAge(int i){
		age += i;
		return age;
	}
}
