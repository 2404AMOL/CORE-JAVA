//QNO6:-Write A Program To Cal Square Of Given Number

class CalSquareReturnResult 
{
	public static int calSquare(int num)
	{
		int Square=num*num;
		if(num%2==0)
		{
		 System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
			return num;
		}
		return Square;
	}
	public static void main(String[] args) 
	{
		System.out.println(calSquare(4));
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>Even										*
-->>16											*
*************************************************/