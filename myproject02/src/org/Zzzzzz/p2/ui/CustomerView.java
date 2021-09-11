package org.Zzzzzz.p2.ui;

import org.Zzzzzz.p2.bean.Customer;
import org.Zzzzzz.p2.service.CustomerList;
import org.Zzzzzz.p2.util.CMUtility;

/**
 * 
 * @Description CustomerView为主模块 负责菜单的显示和处理用户操作
 * @author ByteDance_Zy Email:1802833394@qq.com
 * @version View_code
 * @date 2021年9月9日下午11:05:23
 *
 */
public class CustomerView {
	private CustomerList customerList = new CustomerList(10);
	
	public CustomerView(){
		Customer customer = new Customer("张宇", '男', 19, "18460087220", "1802833394@qq.com");
		customerList.addCustomer(customer);
	}
	/**
	 * 显示《客户信息管理软件》的字样的方法
	 * @Description 
	 * @author ByteDance_Zy
	 * @date 2021年9月10日下午1:44:12
	 */
	public void enterMainMenu(){
		boolean isFlag = true;
		while(isFlag){
			System.out.println("-----------客户管理软件------------");
			System.out.println("            1 添加客户                           ");
			System.out.println("            2 修改客户                           ");
			System.out.println("            3 删除客户                           ");
			System.out.println("            4 客户列表                           ");
			System.out.println("            5 退       出                           \n");
			System.out.println("                       请选择( 1-5 ):        ");
			
			char menu = CMUtility.readMenuSelection();
			switch(menu){
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.print("确认是否退出(Y/N):");
				char isExit = CMUtility.readConfirmSelection();
				if(isExit == 'Y'){
					isFlag = false;
				}
			}
		}
	}
	/**
	 * 添加客户的操作
	 * @Description 
	 * @author ByteDance_Zy
	 * @date 2021年9月10日下午1:41:51
	 */
	public void addNewCustomer(){
		System.out.println("-------------添加客户-----------------");
		System.out.print("姓名：");
		String name = CMUtility.readString(10);
		
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		
		System.out.println("年龄：");
		int age = CMUtility.readInt();
		
		System.out.println("电话：");
		String phone = CMUtility.readString(13);
		
		System.out.println("邮箱：");
		String email = CMUtility.readString(30);
		
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean isSuccess = customerList.addCustomer(customer);
		if(isSuccess){
			System.out.println("------------------------添加完成----------------------");
		}else{
			System.out.println("-------------------客户目录已满，添加失败---------------");
		}
	}
	/**
	 * 修改客户的操作
	 * @Description 
	 * @author ByteDance_Zy
	 * @date 2021年9月10日下午1:42:34
	 */
	public void modifyCustomer(){
		//System.out.println("修改客户操作");
		System.out.println("------------------修改客户----------------");
		Customer cust;
		int number;
		for(;;){
			System.out.println("请选择待修改客户的编号(-1退出)：");
			number = CMUtility.readInt();
			
			if(number == -1){
				return;
			}
			cust = customerList.getCustomer(number-1);
			if(cust == null){
				System.out.println("无法找到指定客户！");
			}else{
				break;
			}
		}
		System.out.println("姓名(" + cust.getName() + "):");
		String name = CMUtility.readString(10, cust.getName());
		System.out.println("性别(" + cust.getGender() +"):");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.println("年龄(" + cust.getAge() +"):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.println("电话(" + cust.getPhone() +"):");
		String phone = CMUtility.readString(13, cust.getPhone());
		System.out.println("邮箱(" + cust.getEmail() +"):");
		String email = CMUtility.readString(30, cust.getEmail());
		
		Customer newCust = new Customer(name, gender, age, phone, email);
		
		boolean isRepalced = customerList.replaceCusomer(number-1, newCust);
		if(isRepalced){
			System.out.println("----------------修改成功------------------");
		}else{
			System.out.println("----------------修改失败------------------");
		}
	}
	/**
	 * 删除客户的操作
	 * @Description 
	 * @author ByteDance_Zy
	 * @date 2021年9月10日下午1:42:45
	 */
	public void deleteCustomer(){
		//System.out.println("删除客户操作");
		System.out.println("---------------------删除客户-------------------");
		int number;
		for(;;){
			System.out.println("请选择待删除客户的编号(-1退出)：");
			number = CMUtility.readInt();
			
			if(number == -1){
				return;
			}
			
			Customer customer = customerList.getCustomer(number-1);
			if(customer == null){
				System.out.println("无法找到指定客户！");
			}else{
				break;
			}
		}
		System.out.println("是否确认删除(Y/N):");
		char isDelete = CMUtility.readConfirmSelection();
		if(isDelete == 'Y'){
			boolean deleteSuccess = customerList.deleteCustomer(number - 1);
			if(deleteSuccess){
				System.out.println("--------------------删除成功-------------------");
			}
		}else{
			return;
		}
		
	}
	/**
	 * 显示客户列表的操作
	 * @Description 
	 * @author ByteDance_Zy
	 * @date 2021年9月10日下午1:43:26
	 */
	private void listAllCustomers(){
		//System.out.println("展示客户操作");
		System.out.println("--------------------客户列表----------------------");
		if(customerList.getTotal() == 0){
			System.out.println("无客户记录！");
		}else{
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs = customerList.getAllCustomers();
			for(int i = 0; i < custs.length; i++){
				Customer cust = custs[i];
				System.out.println((i+1) + "\t" + cust.getName() + 
						"\t" + cust.getGender() +"\t" + cust.getAge() + 
						"\t" + cust.getPhone() + "\t" + cust.getEmail());	
			}
		}
		
		System.out.println("------------------客户列表完成---------------------\n");
	}
	
	public static void main(String[] args){
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}
	
	
}

