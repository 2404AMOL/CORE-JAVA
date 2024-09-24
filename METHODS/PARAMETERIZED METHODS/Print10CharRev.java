//QNO2:-Design A Method To Print First 10 Characters in Reverse Order
class Print10CharRev
{
	public static void main(String[] args) 
	{
		printChar('J');
	}
	public static void printChar(char ch)
	{
		while (ch>='A')
		{
			System.out.println(ch);
			ch--;
		}
	}
}
