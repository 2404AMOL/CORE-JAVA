//QNO16:-Write A Program To Print First 10 Odd Numbers
class Print10OddNum
{
	public static void main(String[] args) 
	{
		print10Odd(1);
	}
	public static void print10Odd(int num)
	{
		while (num<=20)
		{
			if (num%2 == 1)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>1											*
-->>3											*
-->>5											*
-->>7											*
-->>9											*
-->>11											*
-->>13											*
-->>15											*
-->>17											*
-->>19											*
*************************************************/