class CountLowerCase 
{
	public static void main(String[] args) 
	{
		String str="JavaClass";

		System.out.println(str);

		int count=0;

		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				System.out.println(str.charAt(i));
				count++;
			}
		}
		System.out.println("The Number Of Lowercase Letteres :"+count);
	}
}
