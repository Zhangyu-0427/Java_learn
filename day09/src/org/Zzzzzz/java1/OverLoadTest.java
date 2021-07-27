package org.Zzzzzz.java1;
/*
 * 方法的重载（overload） loading...
 * 
 * 1. 定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或参数类型
 *    不同即可。
 *    
 *    	“两同一不同”：同一个类、相同方法名
 *    				参数列表不同：参数个数不同，参数类型不同，顺序不同也考虑在内
 * 2. 举例：
 * 	    Arrays类中重载的sort() / binarySearch()
 * 
 * 3. 判断是否是重载：
 * 		跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系！
 * 		只需按照定义判断即可
 * 
 * 
 */
public class OverLoadTest {

	//如下四个方法构成了重载
	public void getSum(int i, int j){
		System.out.println(i + j);
	}
	
	public void getSum(double d1, double d2){
		System.out.println(d1 + d2);
	}
	
	public void getSum(String s, int i){
		
	}
	
	public void getSum(int i, String s){
		
	}
	
}
