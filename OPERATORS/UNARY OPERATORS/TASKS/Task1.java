class Task1 
{
	public static void main(String[] args) 
	{
		int a=13;//14/15/14/13
		int b=15;//16/15/14/13
		int c=a++;//13/12/13/12/11

		int res1 = --c + a++ + b++ + c++ + --a + --b;
		//	82	 =	12 +  14  + 15 +  12 +  14 +  15;
		int res2 = c-- + --a + --b + c-- + --b  - 2;
		//	63	 =  13 +  13 +  14  + 12 +  13  - 2;

		System.out.println(a);//13
		System.out.println(b);//13
		System.out.println(c);//11
		System.out.println(res1);//82
		System.out.println(res2);//63
	}
}
