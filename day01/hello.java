/*
---对第一个JAVA程序的总结---
1. Java程序编写-编译-运行的过程
编写：我们将编写的java代码保存在以“.java”结尾的源文件中
编译：使用javac.exe命令编译我们的java源文件。格式：javac 源文件名.java
运行：使用java.exe命令解释运行我们的字节码文件。格式：java 类名

2. 
   在一个java源文件中可以声明多个并列的class。但是，只能最多有一个类声明为public的。
而且要求声明为public的类的类名与源文件名必须一致。

3. 程序的入口是main方法。格式是相对固定的。

4. 输出语句
System.out.println(); 输出换行
System.out.print();   输出不换行

5. 每一个执行语句都以";"结束。

6. 编译的过程
编译以后一个或多个字节码文件。字节码文件的文件名与java源文件中的类名相同。
*/
class hello 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
