/*QNO11:-

	*		  *
	*		*
	*	  *
	* * * 	  
	*	  *
	*		*
	*		  *
*/
class K 
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=7;r++)
		{
			for (int c=1;c<=5;c++)
			{
				if ((c==1) ||(c+r==6)||(r==5 &&c==3) || (r==6 && c==4) || (r==7 && c==5))
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}

