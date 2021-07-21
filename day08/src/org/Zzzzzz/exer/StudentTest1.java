package org.Zzzzzz.exer;

public class StudentTest1 {
	public static void main(String[] args) {
		
		Student1[] stus = new Student1[20];
		
		for(int i = 0; i < stus.length; i++){
			stus[i] = new Student1();
			
			stus[i].number = i + 1;
			stus[i].state  = (int)(Math.random() * 6) + 1;
			stus[i].score  = (int)(Math.random() * (100 - 0 + 1));
		}
		StudentTest1 tmp = new StudentTest1();
		
		tmp.print_info(stus);
		System.out.println("******************");
		tmp.serachState(stus, 3);
		System.out.println("******************");
		tmp.sort(stus);
		tmp.print_info(stus);
		
	}//main方法的括号
	
	
	//遍历数组
	public void print_info(Student1[] stus){
		for(int i = 0; i < stus.length; i++)
			System.out.println(stus[i].print());
	}
	/**
	 * 
	 * @Description 查找年级为 state 的学生 并打印其信息
	 * @author ByteDance_Zy
	 * @date 2021年7月22日上午12:14:08
	 * @param stus 查找的数组
	 * @param state 查找的年级
	 */
	public void serachState(Student1[] stus, int state){
		for(int i = 0; i < stus.length; i++){
			if(stus[i].state == state)
				System.out.println(stus[i].print());
		}
	}
	
	/**
	 * 
	 * @Description  对学生成绩进行排序
	 * @author ByteDance_Zy
	 * @date 2021年7月22日上午12:16:47
	 * @param stus 学生数组
	 */
	public void sort(Student1[] stus){
		for(int i = 0; i < stus.length; i++){
			for(int j = 0; j < stus.length - i - 1; j++)
			{
				if(stus[j].score < stus[j + 1].score){
					Student1 tmp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = tmp;
				}
			}
		}
	}
}
	
class Student1{
	int number;//学号
	int state; //年级
	int score; //成绩
	
	public String print(){
		return "学号：" + number + "," + "年级：" + state + "," + "成绩：" + score;
	}
}
