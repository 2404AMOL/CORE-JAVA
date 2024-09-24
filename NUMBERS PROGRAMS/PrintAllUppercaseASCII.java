class PrintAllUppercaseASCII 
{
	public static void main(String[] args) 
	{

		char ch='A';
		int num;

		while (ch<='Z')
		{
			System.out.print(ch+"=");
			num=ch;
			ch++;
			System.out.println(num);
		}
	}
}
