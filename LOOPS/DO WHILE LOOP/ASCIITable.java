//QNO5:-Write A Program to Print ASCII Table
class ASCIITable 
{
	public static void main(String[] args) 
	{
		int num=1;
		char ch;
		do
		{
			System.out.print(num + "=");
			ch=(char)num;
			System.out.println(ch);
			num++;
		}
		while (num<=200);
	}
}
