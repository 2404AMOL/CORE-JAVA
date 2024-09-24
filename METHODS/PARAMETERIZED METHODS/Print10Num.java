//QNO3:-Design A Method To Print First 10 Numbers
class Print10Num 
{
	public static void main(String[] args) 
	{
		printNum(1);
	}
	public static void printNum(int num)
	{
		while(num<=10)
		{
			System.out.println(num);
			num++;
		}
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>1											*
-->>2											*
-->>3											*
-->>4											*
-->>5											*
-->>6											*
-->>7											*
-->>8											*
-->>9											*
-->>10											*
*************************************************/