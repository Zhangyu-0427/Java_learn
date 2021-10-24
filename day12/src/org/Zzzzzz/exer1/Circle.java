package org.Zzzzzz.exer1;

public class Circle {
	private double radius; // 半径
	
	public Circle(){
		radius = 1;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// 返回圆的面积
	public double findArea(){
		return Math.PI * radius * radius;
	}
}
