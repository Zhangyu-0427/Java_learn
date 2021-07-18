package org.Zzzzzz.java;

public class ArrayTest1 {

	public static void main(String[] args){
		int[] arr = new int[10];
		int random_Number = 0, sum = 0, arr_Max = 0, arr_Min = 100;
		
		for(int i = 0; i < arr.length; i++)
		{
			random_Number = (int)(Math.random() * 90) + 10;
			arr[i] = random_Number;
			sum += arr[i];
		}
		
		for(int i = 0;  i < arr.length; i++)
		{
			if(arr[i] > arr_Max)
				arr_Max = arr[i];
			if(arr[i] < arr_Min)
				arr_Min = arr[i];
		}
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println("\n上方数组的平均值、和值、最大值、最小值分别为：" + (float)sum/arr.length + "、" + sum + "、" + arr_Max + "、" + arr_Min);
	}
	
}
