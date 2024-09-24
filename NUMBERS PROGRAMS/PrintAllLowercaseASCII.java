class PrintAllLowercaseASCII 
{
	public static void main(String[] args) 
	{
		int num=97;
		char ch;

		while (num<=122)
		{
			ch=(char)num;
			num++;
			System.out.println(ch);
		}
	}
}
