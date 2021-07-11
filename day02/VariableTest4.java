class VariableTest4 
{
	public static void main(String[] args) 
	{
		// 1. 编码情况
		long l1 = 1223;
		System.out.println(l1);
		// 编译失败 过大的整数
		//long l1 = 5345784375327483249;
		long l1 = 5345784375327483249;
		// 编译错误
		//float f1 = 12.31;

		//2. 编码情况
		// 整型常量，默认类型位int型
		// 浮点型常量，默认类型为double型
		
		byte b1 = 12;
		//byte b2 = b1 + 1; 编译失败

		// float f1 = b1 + 12.3; 编译失败

	}
}
