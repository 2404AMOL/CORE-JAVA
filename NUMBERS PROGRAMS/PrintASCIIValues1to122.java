class PrintASCIIValues1to122 
{
	public static void main(String[] args) 
	{
		int num=1;
		char ch;

		while (num<=122)
		{
			System.out.print(num+"=");
			ch=(char)num;
			num++;
			System.out.println(ch);
		}
	}
}
