package org.Zzzzzz.java;
/*
 * 一、理解“万事万物皆对象”
 * 1.在Java语言范畴内，我们都将功能、结构等封装到类中，通过类的实例化，来调用具体
 * 	  的功能结构
 *  Eg：
 * 	  >Scanner,String等
 *    >文件：File
 *    >网络资源：URL
 *  
 * 2.涉及到Java语言和前端Html、后端的数据库交互时，前后端的结构在Java层面交互时，
 *   都表现为类、对象
 *   
 * 二、内存解析的说明
 *    1.引用类型的变量，只可能存储两类值：null 和 地址值（含变量的类型——HashCode）
 *    
 *    
 * 三、匿名对象的使用
 * 1. 理解：创建的对象没有显式的赋给一个变量名，即为匿名对象
 * 2. 特征：匿名对象只能调用一次
 * 3. 如下
 */
public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		
		p.playGame();
		p.sendEmail();
		
		//匿名对象
//		new Phone().sendEmail();
//		new Phone().playGame();
		
		new Phone().price = 1999;
		new Phone().showPrice();
		
		//********************
		PhoneMall mall = new PhoneMall();
//		mall.show(p);
		
		//匿名对象的使用
		mall.show(new Phone());
		
	}
}

class PhoneMall{
	
	public void show(Phone phone){
		 phone.playGame();
		 phone.sendEmail();
	}
}

class Phone{
	double price;//价格
	
	public void sendEmail(){
		System.out.println("发送邮件");
	}
	
	public void playGame(){
		System.out.println("全军出击！");
	}
	
	public void showPrice(){
		System.out.println("手机价价格为：" + price);
	}
	
}


