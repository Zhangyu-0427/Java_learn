package org.Zzzzzz.exer;

public class Kids extends ManKind{
	private int yearsOld; // 年龄
	
	public Kids(){
		
	}
	
	public Kids(int yearsOld){
		this.yearsOld = yearsOld;
	}
	
	public void printAge(){
		System.out.println("年龄为：" + yearsOld);
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	
	
}
