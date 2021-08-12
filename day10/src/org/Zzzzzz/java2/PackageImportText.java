package org.Zzzzzz.java2;

// 方式一
/* import java.util.ArrayList;
 * import java.util.Arrays;
 * import java.util.HashMap;
 */ 

//方式二
import java.util.*;

import org.Zzzzzz.exer4.Account;
import org.Zzzzzz.exer4.Bank;
import org.Zzzzzz.java2.java3.Dog;

/*
 * 一、package关键字的使用
 *  1、为了更好的实现项目中类的管理，提供包的概念
 *  2、 使用package声明类或接口所属的包，声明在源文件的首行
 *  3、 包属于标识符，遵循标识符的命名规则、规范(xxxyyyzzz)、“见名知意”
 *  4、  每点“.”一次，就代表一层文件目录
 *  
 *  补充：同一个包下，不能命名同名的接口、类
 *       不同的包下，可以命名同名的接口、类
 *       
 *  二、import关键字的使用
 *  import：导入
 *  1. 在源文件中显式的使用import结构导入指定包下的类、接口
 *  2. 声明在包的声明和类的声明之间
 *  3. 如果需要导入多个结构，则并列写出即可
 *  4. 可以使用“ xxx.* ”的方式，表示可以导入xxx包下的所有结构
 *  5. 使用的类或接口是java.lang包下定义的，则可省略import结构
 *  6. 使用的类或接口是本包下定义的，则可以省略import结构
 *  7. 如果在源文件中，使用了不同包下同名的类，则必须至少有一个类需要以全类名的方式显示
 *  8. 使用“ xxx.* ”方式表明可以调用xxx包下的所有结构。但是如果使用的是xxx子包下的结构，则仍需要显式导入
 *  
 *  9. import static： 导入指定类或接口的静态结构：属性或方法
 * 
 */
public class PackageImportText {

	public static void main(String[] args) {
		String info = Arrays.toString(new int[]{1, 2, 3});
		
		Bank bank = new Bank();
		
		ArrayList list = new ArrayList();
		HashMap map = new HashMap();
		
		Scanner s = null;
		
		System.out.println("Hello!");
		
		Person p1 = new Person();
		
		Account acct = new Account(1000);
		//全类名的方式显示
		org.Zzzzzz.exer3.Account acct1 = new org.Zzzzzz.exer3.Account(100, 133, 0.331);
		
		Date date = new Date();
		java.sql.Date date1 = new java.sql.Date(54664516);
		
		Dog a = new Dog();
	}
	
}
