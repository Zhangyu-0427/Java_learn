package org.Zzzzzz.exer;

public class Person {

	private int age;
	private String name;
	
	public Person(){
		age = 18;
	}
	
	public Person(String n, int a){
		name = n;
		age = a;
	}
	
	public void setAge(int a){
		if(a < 0 || a >130){
			System.out.println("传入的数据非法！");
			return;//结束方法
		}
		
		age = a;
	}
	
	public int getAge(){
		
		return age;
	}
	
	public void steName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
}
