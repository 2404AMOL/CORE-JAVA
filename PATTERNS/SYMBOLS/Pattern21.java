/*QNO21:-

	* * * * *
	
	* * * * *
	
	* * * * *
	
*/
class Pattern21
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=5;r++)
		{
			for (int c=1;c<=5;c++)
			{
				if (r%2==1)
				{
					System.out.print(" * ");
				}
				else if (r%2==0)
				{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
