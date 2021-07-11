/*
变量的使用
1. java定义变量的格式：数据类型 变量名 = 变量值；

2. 说明
	1. 变量必须先声明，后使用。
	2. 变量都定义在其作用域内，在作用域内，它是有效的。
	3. 同一个作用域内，不可以声明两个同名的变量。

*/


class  VariableTest{
	public static void main(String[] args) {
		// 变量的定义
		int myAge = 12;
		// 变量的使用
		System.out.println(myAge);
		
		// 变量的声明
		int myNumber;
		myNumber = 1001;
		System.out.println(myNumber);

	}

	public void method(){
		int myClass = 905;
	}


}
