package org.Zzzzzz.exer2;

public class Girl {

	private String name;
	private int age;
	
	public Girl(){
		
	}
	
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void marry(Boy boy){
		System.out.println("我想嫁给" + boy.getName());
		boy.marry(this);
	}
	
	/**
	 * 
	 * @Description  你叫两个对象的大小
	 * @author ByteDance_Zy
	 * @date 2021年7月31日下午9:39:13
	 * @param girl
	 * @return 正数：当前大，负数：当前小 ，0：当前对象和形参对象相等
	 */
	public int compare(Girl girl){
		if(this.age > girl.age)
			return 1;
		if(this.age < girl.age)
			return -1;
		
		return 0;
	}
	
}
