//QNO17:-Write A Program TO Print First Five Characters
class Print5Char
{

	public static void printChar(char a,char e)
	{
		while(a<=e)
		{
			System.out.println(a);
			a++;
		}
	
	}
	public static void main(String[] args) 
	{
		printChar('a','e');
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>a											*
-->>b											*
-->>c											*
-->>d											*
-->>e											*
*************************************************/