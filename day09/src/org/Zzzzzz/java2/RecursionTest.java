package org.Zzzzzz.java2;
/*
 * 递归方法的使用
 * 
 */
public class RecursionTest {

	public static void main(String[] args) {
		
		//例1 ：计算1-100内所有自然数的和
//		int sum = 0;
//		for(int i = 1; i <= 100; i++)
//			sum += i;
		
		RecursionTest test = new RecursionTest();
		int sum = test.getSum(100);
		System.out.println(sum);
		
		System.out.println("**********");
		System.out.println(test.testMath(10));
		
	}
	
	public int getSum(int n){
		if(n == 1)
			return 1;
		else
			return n + getSum(n-1);
	}
	
	public int testMath(int n){
		if(n == 0)
			return 1;
		else if(n == 1)
			return 4;
		else
			return 2 * testMath(n-1) + testMath(n-2);
	}
	
	
}
