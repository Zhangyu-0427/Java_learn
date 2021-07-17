package com.atguigu.exer;

import java.util.Scanner;

public class leval_score {
	public static void main(String[] args){
		Scanner tmp = new Scanner(System.in);
		System.out.println("请输入学生个数：");
		int arraySize = tmp.nextInt();
		int[] score_Arr = new int[arraySize];
		int max_Score = 0;
		
		for(int i = 0; i < arraySize; i++)
		{
			score_Arr[i] = tmp.nextInt();
			
			if(score_Arr[i] >= max_Score)
				max_Score = score_Arr[i];
		}
		
		System.out.println("最高分为：" + max_Score);
		
		for(int i = 0; i < arraySize; i++)
		{
			if(max_Score - score_Arr[i] <= 10)
				System.out.println("grade : A");
			else if(max_Score - score_Arr[i] <= 20)
				System.out.println("grade : B");
			else if(max_Score - score_Arr[i] <= 30)
				System.out.println("grade : C");
			else
				System.out.println("grade : D");
		}
	}
}
