

class FamilyAccount{

	public static void main(String[] args){

		boolean isFlag = true;
		
		String details = "收支\t账户余额\t收支金额\t说  明\n";

		int balance = 10000;

		while(isFlag){
				
			System.out.println("-----------家庭收支记账软件----------\n");
			System.out.println("                1. 收支明细");
			System.out.println("                2. 登记收入");
			System.out.println("                3. 登记支出");
			System.out.println("                4. 退    出\n");
			System.out.println("                请选择(1 - 4)");

			char selection = Utility.readMenuSelection();
			switch(selection){
				case '1':
					System.out.println("-----------当前收支明细记录------------");
					System.out.println(details);
					System.out.println("---------------------------------------");
					break;
				case '2':
					System.out.print("本次收入金额：");
					int money = Utility.readNumber();
					System.out.print("本次收入说明：");
					String info = Utility.readString();
					
					balance += money;
					details += ("收入\t" + balance + "\t\t" + money +	"\t\t" + info + "\n");

					System.out.println("----------------登记完成---------------\n");
					break;
				case '3':
					System.out.print("本次支出金额：");
					int money0 = Utility.readNumber();
					System.out.print("本次支出说明：");
					String info0 = Utility.readString();
					
					if(balance >= money0){
						balance -= money0;
						details += ("支出\t" + balance + "\t\t" + money0 +	"\t\t" + info0 + "\n");
					}
					else
						System.out.println("支付金额超出能力范围外！！");

					System.out.println("----------------登记完成---------------");
					break;
				case '4':
					System.out.print("确认是否退出(Y / N):  ");
					char isExit = Utility.readConfirmSelection();
					if(isExit == 'Y')
						isFlag = false;
			}

		}
	}

}