package org.Zzzzzz.exer2;

public class BoyGirlTest {

	public static void main(String[] args) {
		
		Boy boy = new Boy("zhangyu", 19);
		boy.shout();
		
		Girl girl = new Girl("guoguo", 20);
		girl.marry(boy);
		
		Girl girl1 = new Girl("zhu",18);
		int flag = girl.compare(girl1);
		System.out.println(flag);
		
	}
	
}
