/*QNO12:-

	*		  
	*		
	*	  
	* 	  
	*	  
	*		
	* * * * * *
*/
class L 
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=6;r++)
		{
			for (int c=1;c<=5;c++)
			{
				if (c==1 || r==6)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
