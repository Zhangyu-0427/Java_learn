package org.Zzzzzz.java1;

public class Student extends Person{

	String major;
	
	public Student(){
		
	}
	
	public Student(String major){
		this.major = major;
	}
	
	// 对父类中的eat方法进行了重写
	public void eat(){
		System.out.println("吃---饭");
	}
	
	public void study(){
		System.out.println("学习，专业是：" + major);
	}
	
	public void show(){
		System.out.println("HHHHH");
	}
	
	public String info(){
		return null;
	}
	
	//	public int info1(){
	//		return 1;
	//	}
}
