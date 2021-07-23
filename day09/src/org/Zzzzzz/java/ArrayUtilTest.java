package org.Zzzzzz.java;

public class ArrayUtilTest {
	public static void main(String[] args) {
		
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[]{34,56,89,45,67,21,94,67,84,99,46}; //11个数
		
		util.print(arr);
		int max = util.getMax(arr);
		System.out.println("最大值为：" + max);
		//util.print(arr);
		System.out.println(util.getAvg(arr));
		System.out.println(util.getMin(arr));
		System.out.println(util.getSum(arr));
		System.out.println(util.getIndex(arr, 99));
		util.sort(arr);
		util.print(arr);
		util.reverse(arr);
		System.out.println("\n");
		util.print(arr);
	}
}
