package org.Zzzzzz.java;
/*
 * 自定义数组的工具类
 * 
 * 
 */
public class ArrayUtil {

	//求数组的最大值
	public int getMax(int[] arr){
		int max = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(max < arr[i])
				max = arr[i];
		}
		
		return max;
	}
	
	//求数组的最小值
	public int getMin(int[] arr){
		int min = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(min > arr[i])
				min = arr[i];
		}
		
		return min;
	}
	
	//求数组的平均值
	public int getAvg(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum/arr.length;
	}
	
	//求数组的总和
	public int getSum(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		
		return sum;
	}
	
	//反转数组
	public void reverse(int[] arr){
		for(int i = 0; i < arr.length/2; i++){
			int tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
	}
	
	//复制数组
	public int[] copy(int[] arr){
		int[] tmp = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			tmp[i] = arr[i];
		}
		
		return tmp;
	}
	
	//数组排序
	public void sort(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			
			for(int j = 0; j < arr.length - 1 - i; j++){
				if(arr[j] > arr[j + 1]){
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
	
	//遍历数组
	public void print(int[] arr){
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
	//查找指定元素 返回其索引
	public int getIndex(int[] arr, int dest){
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == dest)
				return i;
		}
		
		return -1;
	}
	
	
}
