/*
强制类型转换：自动类型提升运算的逆运算
1. 需要使用强转符：()
2. 可能会导致精度损失
*/
class VariableTest3{
	public static void main(String[] args){
		
		double d1 = 12.3;

		int i1 = (int)d1;//截断操作
	}
}
