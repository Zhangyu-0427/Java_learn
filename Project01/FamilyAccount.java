

class FamilyAccount{

	public static void main(String[] args){

		boolean isFlag = true;
		
		String details = "��֧\t�˻����\t��֧���\t˵  ��\n";

		int balance = 10000;

		while(isFlag){
				
			System.out.println("-----------��ͥ��֧�������----------\n");
			System.out.println("                1. ��֧��ϸ");
			System.out.println("                2. �Ǽ�����");
			System.out.println("                3. �Ǽ�֧��");
			System.out.println("                4. ��    ��\n");
			System.out.println("                ��ѡ��(1 - 4)");

			char selection = Utility.readMenuSelection();
			switch(selection){
				case '1':
					System.out.println("-----------��ǰ��֧��ϸ��¼------------");
					System.out.println(details);
					System.out.println("---------------------------------------");
					break;
				case '2':
					System.out.print("���������");
					int money = Utility.readNumber();
					System.out.print("��������˵����");
					String info = Utility.readString();
					
					balance += money;
					details += ("����\t" + balance + "\t\t" + money +	"\t\t" + info + "\n");

					System.out.println("----------------�Ǽ����---------------\n");
					break;
				case '3':
					System.out.print("����֧����");
					int money0 = Utility.readNumber();
					System.out.print("����֧��˵����");
					String info0 = Utility.readString();
					
					if(balance >= money0){
						balance -= money0;
						details += ("֧��\t" + balance + "\t\t" + money0 +	"\t\t" + info0 + "\n");
					}
					else
						System.out.println("֧������������Χ�⣡��");

					System.out.println("----------------�Ǽ����---------------");
					break;
				case '4':
					System.out.print("ȷ���Ƿ��˳�(Y / N):  ");
					char isExit = Utility.readConfirmSelection();
					if(isExit == 'Y')
						isFlag = false;
			}

		}
	}

}