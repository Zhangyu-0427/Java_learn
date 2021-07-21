package org.Zzzzzz.exer;

public class StudentTest {
	public static void main(String[] args) {
		
		Student[] stus = new Student[20];
		
		for(int i = 0; i < stus.length; i++){
			stus[i] = new Student();
			
			stus[i].number = i + 1;
			stus[i].state  = (int)(Math.random() * 6) + 1;
			stus[i].score  = (int)(Math.random() * (100 - 0 + 1));
		}
		
		for(int i = 0; i < stus.length; i++)
			System.out.println(stus[i].print());
		
		
		System.out.println("******************");
		
		for(int i = 0; i < stus.length; i++){
			if(stus[i].state == 3)
				System.out.println(stus[i].print());
		}
		
		System.out.println("******************");
		
		for(int i = 0; i < stus.length; i++){
			for(int j = 0; j < stus.length - i - 1; j++)
			{
				if(stus[j].score < stus[j + 1].score){
					Student tmp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = tmp;
				}
			}
		}
		for(int i = 0; i < stus.length; i++)
			System.out.println(stus[i].print());
			
		
	}
}

class Student{
	int number;//学号
	int state; //年级
	int score; //成绩
	
	public String print(){
		return "学号：" + number + "," + "年级：" + state + "," + "成绩：" + score;
	}
}
