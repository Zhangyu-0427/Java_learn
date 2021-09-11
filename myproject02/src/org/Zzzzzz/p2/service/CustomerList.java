package org.Zzzzzz.p2.service;

import org.Zzzzzz.p2.bean.Customer;

/**
 * 
 * @Description 管理Cutstomer类的工具 以对象数组形式提供增删查改等功能
 * @author ByteDance_Zy Email:1802833394@qq.com
 * @version View_code
 * @date 2021年9月9日下午11:01:47
 *
 */
public class CustomerList {
	private Customer[] customers;
	private int total = 0;
	
	/**
	 * 用来初始化customers数组的构造器
	 * @param totalCustomer：指定数组的长度
	 */
	public CustomerList(int totalCustomer){
		customers = new Customer[totalCustomer];
	}
	/**
	 * 
	 * @Description 将指定的客户添加到数组中
	 * @author ByteDance_Zy
	 * @date 2021年9月9日下午11:52:08
	 * @param customer
	 * @return true:添加成功 false:添加失败
	 */
	public boolean addCustomer(Customer customer){
		if(total >= customers.length){
			return false;
		}
		
		customers[total++] = customer;
		return true;
	}
	/**
	 * 
	 * @Description 修改指定索引位置客户的信息
	 * @author ByteDance_Zy
	 * @date 2021年9月9日下午11:58:18
	 * @param index
	 * @param cust
	 * @return true:修改成功 false:修改失败
	 */
	public boolean replaceCusomer(int index, Customer cust){
		if(index < 0 || index > total - 1){
			return false;
		}
		else{
			customers[index] = cust;
			return true;
		}
	}
	/**
	 * 
	 * @Description 删除指定索引位置的客户信息
	 * @author ByteDance_Zy
	 * @date 2021年9月10日上午12:06:42
	 * @param index
	 * @return true:删除成功 false:删除失败
	 */
	public boolean deleteCustomer(int index){
		if(index < 0 || index > total - 1){
			return false;
		}
		//数组是顺序表 具有有序这一特点 在删除操作进行中你必须保证有序
		for(int i = index; i < total - 1; i++){
			customers[i] = customers[i+1];
		}
		customers[total-1] = null;
		total--;
		return true;
	}
	/**
	 * 
	 * @Description 获取所有客户信息
	 * @author ByteDance_Zy
	 * @date 2021年9月10日上午12:25:11
	 * @return
	 */
	public Customer[] getAllCustomers(){
		Customer[] cuts = new Customer[total];
		for(int i = 0; i < total; i++){
			cuts[i] = customers[i];
		}
		return cuts;
	}
	/**
	 * 
	 * @Description 获取指定索引位置的客户信息
	 * @author ByteDance_Zy
	 * @date 2021年9月10日上午12:30:38
	 * @param index
	 * @return true:获取成功  false:获取失败
	 */
	public Customer getCustomer(int index){
		if(index < 0 || index >= total)
			return null;
		
		return customers[index];	
	}
	/**
	 * 
	 * @Description 获取存储客户的数量
	 * @author ByteDance_Zy
	 * @date 2021年9月10日上午12:33:09
	 * @return 客户的数量
	 */
	public int getTotal(){
		return total;
	}
	
	
}
