//QNO13:-Design A Method To Chack Given Number Is Odd Or Even
class OddEvenNum
{
	public static void main(String[] args) 
	{
		checkOddEven(4);
	}
	public static void checkOddEven(int num)
	{
		if (num%2 == 0)
		{
			System.out.println(num+" : EVEN");
		}
		else
		{
			System.out.println(num+" : ODD");
		}
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>4:-This Is Even Number						*
*************************************************/