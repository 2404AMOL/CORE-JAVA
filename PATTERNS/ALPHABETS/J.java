/*QNO10:-

	* * * * * *
		  *
		  *
	*	  *
	*	  *
	* * * *
*/
class J
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=6;r++)
		{
			for (int c=1;c<=6;c++)
			{
				if ((r==1 || c==4 )|| (r==6 && (c>=1 && c<=4)) || (c==1 && (r>=4 && r<=6)))
				{
					System.out.print(" "+"*");
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
