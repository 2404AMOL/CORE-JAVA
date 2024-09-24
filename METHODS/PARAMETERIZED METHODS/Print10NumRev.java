//QNO4:Design A Method To Print First 10 Numbers In Reverse Orders
class Print10NumRev
{
	public static void main(String[] args) 
	{
		printNum(10);
	}
	public static void printNum(int num)
	{
		while (num>=1)
		{
			System.out.println(num);
			num--;
		}
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>10											*
-->>9											*
-->>8											*
-->>7											*
-->>6											*
-->>5											*
-->>4											*
-->>3											*
-->>2											*
-->>1											*
*************************************************/