package org.Zzzzzz.exer1;

public class CylinderTest {
	
	public static void main(String[] args) {
		
		Cylinder c1 = new Cylinder();
		
		c1.setLength(3.4);
		c1.setRadius(2.1);
		double volume = c1.findVolume();
		
		System.out.println("圆柱的体积为：" + volume);
		
		double area = c1.findArea();
		
		System.out.println("圆柱的底面积为：" + area);
		
		
	}
}
