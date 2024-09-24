/*QNO15:-

	  * * * * *	
	* 		    *
	*	 		*
	* 	        *
	*	        *
	*		  	*
	  * * * * *
*/
class O
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=7;r++)
		{
			for (int c=1;c<=7;c++)
			{
				if ((r==1 && c>1 && c<=6) || (c==1 && r>1 && r<=6) || (r==7 && c>1 && c<=6) || (c==7 && r>1 && r<=6))
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
