/*QNO17:-

	  * * * * *	
	* 		    *
	*	 		*
	* 	  *     *
	*	    *   *
	*		  *	*
	  * * * * * *
				  *
	  				*
*/					
class Q 
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=9;r++)
		{
			for (int c=1;c<=9;c++)
			{
				if ((r==1 && c>1 && c<=6) || (c==1 && r>1 && r<=6) || (r==7 && c>1 && c<=6) || (c==7 && r>1 && r<=6) || (r>=4 && c==r))
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
