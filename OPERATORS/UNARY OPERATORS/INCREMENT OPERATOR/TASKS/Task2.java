class Task2 
{
	public static void main(String[] args) 
	{
		int a=1;
		int b=2;
		int c=++a;

		int res1 = ++c + a++ + b++ + ++c + a++ + ++b;
		int res2 = a++ + ++c + a + b++ + ++c + a + a++ + 1;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(res1);
		System.out.println(res2);
	}
}
