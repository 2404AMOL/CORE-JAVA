class MainMethod 
{
	public static void main(String[] args) 
	{
		main();
		main("Hello");
		main(24);

	}
	public static void main()
	{
		System.out.println("This is No-Args Main Method");
	}
	public static void main(String str)
	{
		System.out.println(str);
	}
	public static void main(int num)
	{
		System.out.println(num);
	}
}
