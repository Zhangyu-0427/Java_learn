package org.Zzzzzz.exer;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		//p1.setAge(15);
		
		System.out.println("年龄为：" + p1.getAge());
		
		Person p2 = new Person("guoguo", 20);
		System.out.println(p2.getName() + " " + p2.getAge());
		
	}
	
	
}
