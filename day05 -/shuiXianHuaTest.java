class shuiXanHuaTest {
	public static void main(String[] args) {
		int ge = 0, shi = 0, bai = 0;
		for(int i = 100; i <= 999; i++)
		{
			ge  = i % 10;
			shi = i / 10 % 10;
			bai = i / 100;

			if(i == ((ge * ge * ge) + (shi * shi * shi) + (bai * bai * bai)))
				System.out.println(i);
		}

	}
}