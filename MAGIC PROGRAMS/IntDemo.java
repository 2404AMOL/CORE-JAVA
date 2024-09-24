class IntDemo 
{
	public static void main(String[] args) 
	{
		int a=34.0;
		int b=7;

		int k=a%b;//CTE  incompatible types: possible lossy conversion from double to int

		System.out.println(k);
	}
}
//CTE
