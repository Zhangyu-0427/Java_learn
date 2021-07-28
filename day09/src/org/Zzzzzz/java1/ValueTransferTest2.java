package org.Zzzzzz.java1;

public class ValueTransferTest2 {

	public static void main(String[] args) {
		
		Data tmp = new Data();
		
		tmp.m = 10;
		tmp.n = 20;
		
		ValueTransferTest2 test = new ValueTransferTest2();
		test.swap(tmp);
		
		System.out.println("m = " + tmp.m + "; n = " + tmp.n);
		
	}
	
	public void swap(Data data){
		int tmp = data.m;
		data.m  = data.n;
		data.n  = tmp;
		
		
	}
}

class Data{
	
	int m;
	int n;
	
}
