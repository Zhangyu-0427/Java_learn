package org.Zzzzzz.exer;

public class CircleTest {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.radius = 2.1;
		
		double area = c1.findArea();
		System.out.println(area);
		
	}
}

class Circle{
	
	//属性
	double radius;
	
	//方法 求圆的面积
	public double findArea(){
		double area = Math.PI * radius * radius;
		return area;
	}
}
