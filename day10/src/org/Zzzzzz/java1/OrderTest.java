package org.Zzzzzz.java1;

import org.Zzzzzz.java.Order;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		//出了Order类所属的包后，私有的结构、缺省声明的结构就不可以调用了
//		order.orderDefault = 1;
		
		order.orderPublic  = 2;
		
		//出了Order类后，私有的结构就不可以调用了
//		order.orderPrivate = 3;  //The field Order.orderPrivate is not visible
		
		
		//出了Order类所属的包后，私有的结构、缺省声明的结构就不可以调用了
//		order.methodDefault();
		
		order.methodPublic();
		
		//出了Order类后，私有的结构就不可以调用了
//		order.methodPrivate();  //The method methodPrivate() from the type Order is not visible
	}
	
}
