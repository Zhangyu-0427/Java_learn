/*
������������֮����������

ǰ�᣺��������ֻ��7�ֻ����������ͼ�����㣬������boolean���͵�

1. �Զ���������
	���ۣ�������С���������͵ı�������������������͵ı���������ʱ������Զ�����Ϊ����������͡�
	byte ��char ��short --> int --> long --> float --> double

	�ر�ģ���byte��char��short�������͵ı���������ʱ�����Ϊint��

˵������ʱ��������Сָ���ǣ���ʾ���ķ�Χ��С�����磺float����Ҫ����long������
*/
class VariableTest2{
	public static void main(String[] args){
		
		byte b1 = 2;
		int i1 = 21;
		//���벻ͨ��
		//byte b2 = b1 + i1;
		int i2 = b1 + i1;
		System.out.println(i2);

		float f = b1 + i1;
		System.out,println(f);

	}
}
