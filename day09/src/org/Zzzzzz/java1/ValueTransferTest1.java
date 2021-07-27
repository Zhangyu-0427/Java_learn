package org.Zzzzzz.java1;
/*
 * 方法形参的传递机制：值传递
 * 
 * 1. 形参：方法定义时，声明的小括号内的参数
 *    实参：方法调用时，实际传递给形参的数据
 * 
 * 2. 值传递的机制
 *    如果参数是基本数据类型，此时实参赋给形参的是实参真实储存的数据值。
 *    如果参数是引用数据类型，此时实参赋给形参的是实参储存数据的地址值。
 */
public class ValueTransferTest1 {
	
	public static void main(String[] args) {
		int m = 10;
		int n = 20;
		
		System.out.println("m = " + m + "; n = " + n);
		
//		int tmp =m;
//		m = n;
//		n = tmp;
		
		ValueTransferTest1 tmp = new ValueTransferTest1();
		tmp.swap(m, n);
		
		System.out.println("m = " + m + "; n = " + n);
	}
	
	public void swap(int m, int n){
		int tmp =m;
		m = n;
		n = tmp;
	}
	
}
