package org.Zzzzzz.java3;

import org.Zzzzzz.java2.Order;

public class OrderTest {
	public static void main(String[] args) {
		
		Order order = new  Order();
		order.orderPublic = 1;
		order.methodPublic();
		
		
		// 不同包下的普通类（非子类）要使用Order类的话，不可以调用声明为Private、缺省、protected权限的属性、方法
//		order.orderPrivate = 2;
//		order.orderDefaul = 3;
//		order.orderProtected = 4;
//		
//		order.methodPrivate();
//		order.methodDefaul();
//		order.methodProtected();
		
	}
	
}
