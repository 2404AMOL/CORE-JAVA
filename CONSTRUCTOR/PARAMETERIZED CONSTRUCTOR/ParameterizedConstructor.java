class ParameterizedConstructor 
{
	ParameterizedConstructor(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		ParameterizedConstructor obj = new ParameterizedConstructor(1,2);
	}
}
