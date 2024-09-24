/*QNO16:-

	* * * * 	
	* 		*  
	*		*
	* 		*  
	* * * *  	  
	*
	* 
	*
	*
*/
class P
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=9;r++)
		{
			for (int c=1;c<=6;c++)
			{
				if ((c==1) || (r==1 && c<=4) || (r==5 && c<=4) || (c==5 && r>1 && r<=4))
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+ " ");
				}
			}
			System.out.println();
		}
	}
}
