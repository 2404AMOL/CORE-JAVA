//QNO1:-Design A Method To Print First 10 Characters
class PrintFirst10Char 
{
	public static void main(String[] args) 
	{
		charPrint('a');	
	}
	public static void charPrint(char ch)
	{
		while(ch<='j')
		{
			System.out.println(ch);
			ch++;
		}
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
-->>f											*
-->>g											*
-->>h											*
-->>i											*
-->>j											*
*************************************************/