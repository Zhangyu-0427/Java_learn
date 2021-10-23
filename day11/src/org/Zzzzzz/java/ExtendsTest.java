package org.Zzzzzz.java;
/*
 * 面向对象特征之二：继承性 why?
 * 
 * 一、继承性的好处
 * 
 * 1. 减少代码的冗余，提高代码的复用性
 * 2. 便于功能的拓展
 * 3. 为之后多态性的使用，提供了前提
 * 
 * 二、继承性的格式：class A extends B{}
 * 
 * 		A: 子类、派生类、subclass
 * 		B: 父类、超类、基类、superclass
 * 
 * 		2.1 体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的所有属性和方法
 * 			特别的，父类中声明为private的属性和方法，子类继承父类以后，仍获取了父类中
 * 		私有的结构。只是因为封装性的影响，使得子类不能直接调用父类的结构而已。
 * 
 * 		2.2 子类继承父类以后，还可以声明自己特有属性和方法，实现功能的拓展
 * 		子类和父类的关系，不同于子集和集合的关系
 * 		extends：延展、扩展
 * 三、java中关于继承性的规定：
 * 
 * 		1. 一个类可以被多个子类继承
 * 		2. java中类的单继承性：一个类最多只能有一个父类  --- （C++允许多重继承）
 * 		3. 子父类是相对的概念
 * 		4. 子类直接继承的父类，称为：直接父类。间接继承的父类称为：间接父类
 * 		5. 子类继承父类以后， 就获取了直接父类以及所有间接父类中声明的属性和方法
 * 四、 
 * 		1. 如果我们没有显示的声明一个类的父类的话，则此类继承于java.lang.Object类
 * 	    2. 所有的Java类(除Java.lang.Object类之外)都直接或间接继承于java.lang.Object类
 * 		3. 意味着，所有的Java类具有java.lang.Object类中声明的功能
 */
public class ExtendsTest {
	public static void main(String[] args) {
		
		Person p1 = new Person("ad", 25);
//		p1.age = 18;
		p1.eat();
		p1.breath();
		System.out.println("年龄为：" + p1.getAge());
		
		
		Student s1 = new Student();
		s1.eat();
//		s1.sleep();
		s1.name = "Tom";
		s1.breath();
		System.out.println("年龄为：" + s1.getAge());
		
		Creature c = new Creature();
		c.breath();
		System.out.println(c.toString());
	}
}
