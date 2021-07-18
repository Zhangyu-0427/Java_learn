package org.Zzzzzz.exer;

public class BishiExer {

	public static void main(String[] args){
		
		int[] arr = new int[6];
		
		int random = 0, i = 0;
		boolean flag_Number = false, flag_Index = false;
		for(int j = 0; j < arr.length; j++){
			
			flag_Number = true;//默认不重复
			flag_Index = true;//默认索引有效
			i = (int)(Math.random() * 6);
			random = (int)(Math.random() * 30) + 1;
			//System.out.println(i + " " + random);
			for(int k = 0; k < arr.length; k++){
				if(random == arr[k])
				{
					flag_Number = false;//此随机数已重复
					break;
				}
			}
			
			if(arr[i] != 0)
				flag_Index = false;//此索引无效
			
			if(flag_Number && flag_Index)
			{
				arr[i] = random;
			}
			else
			{
				j--;
			}
		}
		
		for(int l = 0; l < arr.length; l++)
			System.out.print(arr[l] + " ");
		
		
		
	}
	
}
