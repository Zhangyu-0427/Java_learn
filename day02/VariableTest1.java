/*
Java定义的数据类型

一、变量按照数据类型来分：

    基本数据类型：
		整型：  byte、int、long
		浮点型：float、double
		字符型：char
		布尔型：boolean

	引用数据类型：
		类(class)
		接口(interface)
		数组(array)

二、变量在类中声明的位置：
		成员变量 vs 局部变量

*/
class VariableTest1 {
	public static void main(String[] args) {
		//1. 整型：byte(1字节 = 8bit) \ short(2字节) \ int(4字节) \ long(8字节)
		// byte范围: [-128,127]
		byte b1 = 127;
		byte b2 = -128;
		//byte b2 = 128; 编译不通过
		System.out.println(b1);
		System.out.println(b2);
		//声明 long型变量时，字面值必须以“l”或“L”结尾
		//通常，定义整型变量时，使用int型
		short s1 = 128;
		int i1 = 23134;
		long l1 = 2124141786487L;
		System.out.println(l1);

		//2. 浮点型：float(4字节) \ double(8字节)
		//1. 浮点型：表示带小数点的数值
		//2. float表示数值的范围比long还大

		double d1 = 123.1;
		// 定义float类型变量时，变量要以“f”或“F”结尾
		float f1 = 12.3F;

		System.out.println(d1 + 1);
		//通常定义浮点型变量，使用double型

		//3. 字符型：char（1字符 = 2字节）
		//定义char变量时，通常使用一对''

		char c1 = '1';
		System.out.println(c1);

		// 表示方法：1. 声明一个字符 。2. 转义字符。3. 直接使用 unicode 值来表示字符型常量

		char c2 = '\n';
		char c3 = '\u0043';
		System.out.println(c3);
		//4. 布尔型：boolean
		// 只能取两个值之一：true \ false
		// 常常用在条件判断，循环结构中使用
		boolean  bb1 = true;

		System.out.println(bb1);

		boolean isMarried = true;
		if(isMarried){
			System.out.println("恭喜！！！");
		}
		else{
			System.out.println("找个女票吧");
		}


	}

}
