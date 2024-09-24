class Task1 
{
	public static void main(String[] args) 
	{
		int a=2;//3//4//5
		int b=2;//3//4
		int c=a++ + ++a + ++b + b++ + ++a;
		//	   2  +  4  +  3  +  3  +  5
		System.out.println(a);//5
		System.out.println(b);//4
		System.out.println(c);//17

	}
}
