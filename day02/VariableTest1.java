/*
Java�������������

һ���������������������֣�

    �����������ͣ�
		���ͣ�  byte��int��long
		�����ͣ�float��double
		�ַ��ͣ�char
		�����ͣ�boolean

	�����������ͣ�
		��(class)
		�ӿ�(interface)
		����(array)

��������������������λ�ã�
		��Ա���� vs �ֲ�����

*/
class VariableTest1 {
	public static void main(String[] args) {
		//1. ���ͣ�byte(1�ֽ� = 8bit) \ short(2�ֽ�) \ int(4�ֽ�) \ long(8�ֽ�)
		// byte��Χ: [-128,127]
		byte b1 = 127;
		byte b2 = -128;
		//byte b2 = 128; ���벻ͨ��
		System.out.println(b1);
		System.out.println(b2);
		//���� long�ͱ���ʱ������ֵ�����ԡ�l����L����β
		//ͨ�����������ͱ���ʱ��ʹ��int��
		short s1 = 128;
		int i1 = 23134;
		long l1 = 2124141786487L;
		System.out.println(l1);

		//2. �����ͣ�float(4�ֽ�) \ double(8�ֽ�)
		//1. �����ͣ���ʾ��С�������ֵ
		//2. float��ʾ��ֵ�ķ�Χ��long����

		double d1 = 123.1;
		// ����float���ͱ���ʱ������Ҫ�ԡ�f����F����β
		float f1 = 12.3F;

		System.out.println(d1 + 1);
		//ͨ�����帡���ͱ�����ʹ��double��

		//3. �ַ��ͣ�char��1�ַ� = 2�ֽڣ�
		//����char����ʱ��ͨ��ʹ��һ��''

		char c1 = '1';
		System.out.println(c1);

		// ��ʾ������1. ����һ���ַ� ��2. ת���ַ���3. ֱ��ʹ�� unicode ֵ����ʾ�ַ��ͳ���

		char c2 = '\n';
		char c3 = '\u0043';
		System.out.println(c3);
		//4. �����ͣ�boolean
		// ֻ��ȡ����ֵ֮һ��true \ false
		// �������������жϣ�ѭ���ṹ��ʹ��
		boolean  bb1 = true;

		System.out.println(bb1);

		boolean isMarried = true;
		if(isMarried){
			System.out.println("��ϲ������");
		}
		else{
			System.out.println("�Ҹ�ŮƱ��");
		}


	}

}