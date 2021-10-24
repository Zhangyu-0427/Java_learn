package org.Zzzzzz.java2;
/*
 * 
 * 体会4种不同的权限修饰
 */
public class Order {

	private int orderPrivate;
	
	int orderDefaul;
	
	protected int orderProtected;
	
	public int orderPublic;
	
	
	// 1
	private void methodPrivate(){
		orderPrivate = 1;
		orderDefaul = 2;
		orderProtected = 3;
		orderPublic = 4;
	}
	
	// 2
	void methodDefaul(){
		orderPrivate = 1;
		orderDefaul = 2;
		orderProtected = 3;
		orderPublic = 4;
	}
	
	// 3
	protected void methodProtected(){
		orderPrivate = 1;
		orderDefaul = 2;
		orderProtected = 3;
		orderPublic = 4;
	}
	
	// 4
	public void methodPublic(){
		orderPrivate = 1;
		orderDefaul = 2;
		orderProtected = 3;
		orderPublic = 4;
	}
	
}
