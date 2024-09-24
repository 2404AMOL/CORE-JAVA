/*QNO20:-

	# % * & ?
	# % * & ?
	# % * & ?
	# % * & ?
	# % * & ?
	
*/
class Pattern20
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=5;r++)
		{
			for (int c=1;c<=5;c++)
			{
				if (c==1)
				{
					System.out.print(" # ");
				}
				else if(c==2)
				{
					System.out.print(" % ");
				}
				else if(c==3)
				{
					System.out.print(" * ");
				}
				else if(c==4)
				{
					System.out.print(" & ");
				}
				else
				{
					System.out.print(" ? ");
				}
			}
			System.out.println();
		}
	}
}
