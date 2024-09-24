class Program4 
{
	public static void main(String[] args) 
	{
		int a=1;//2//3
		int b=2;//3//4
		int c=++a + ++b + ++a + ++b;
		//	   2  +  3  +  3  + 4   =12
		System.out.println(a);//3
		System.out.println(b);//4
		System.out.println(c);//12

	}
}
