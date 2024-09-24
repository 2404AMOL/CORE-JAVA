//QNO1:-Write A program to Find Cube Of Given Even Number
class FindCubeEven
{
	public static void main(String[] args) 
	{
		int num=4;
		int cube=1;

		if (num%2==0)
		{
			for (int i=1;i<=3;i++)
			{
				cube*=num;
			}
			System.out.println("The Cube is:-"+cube);
		}
		else
		{
			System.out.println("The Given Number Is Odd");
		}
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>64											*
*************************************************/