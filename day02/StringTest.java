/*

String类型变量的使用
1. String属于引用数据类型，翻译为：字符串

2. 声明String类型变量时，使用一对""

3. String可以和8种基本类型变量做运算，且运算只能是连接运算：+

4. 运算结果是String类型

*/
class StringTest
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		String s1 = "hello world!";

		String s2 = "a";

		String s3 = "";

		//char c1 = '';//编译不通过

		int number = 1001;
		String numberStr = "学号：";

		String info = numberStr + number;

		System.out.println(info);
	}
}
