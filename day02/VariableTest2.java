/*
基本数据类型之间的运算规则

前提：这里讨论只是7种基本数据类型间的运算，不包含boolean类型的

1. 自动类型提升
	结论：当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的类型。
	byte 、char 、short --> int --> long --> float --> double

	特别的：当byte、char、short三种类型的变量做运算时，结果为int型

说明：此时的容量大小指的是，表示数的范围大小。比如：float容量要大于long的容量
*/
class VariableTest2{
	public static void main(String[] args){
		
		byte b1 = 2;
		int i1 = 21;
		//编译不通过
		//byte b2 = b1 + i1;
		int i2 = b1 + i1;
		System.out.println(i2);

		float f = b1 + i1;
		System.out,println(f);

	}
}
