package org.Zzzzzz.java3;

import org.Zzzzzz.java2.Order;

public class SubOrder extends Order {
	
	public void method(){
		orderProtected = 1;
		orderPublic = 2;
		
		methodProtected();
		methodPublic();
		
		// 在不同包的子类中，不能调用Order类中声明为private和缺省权限的属性、方法
//		orderDefaul = 3;
//		orderPrivate = 4;
//		
//		methodDefaul();
//		methodPrivate();
	}
}
