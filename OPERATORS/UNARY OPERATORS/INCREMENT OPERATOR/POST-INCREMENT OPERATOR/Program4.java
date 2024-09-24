class Program4 
{
	public static void main(String[] args) 
	{
		int a=1;//2
		int b=2;//3
		int c=a++;//1
		int d=b++;//2//3

		System.out.println(a);//2
		System.out.println(d++);//2
		System.out.println(b);//3
		System.out.println(c);//1
		System.out.println(d);//3
	}
}
