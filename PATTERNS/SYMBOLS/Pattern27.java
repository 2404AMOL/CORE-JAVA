class Pattern27 
{
	public static void main(String[] args) 
	{
		for (int r=1;r<=5;r++)
		{
			for (int c=1;c<=5;c++)
			{
				if (r==3 && c==3 && r==2 && c==2 && r==4)
				{
					System.out.print(" "+"*");
				}
				else
				{
					System.out.print(" "+"#");
				}
			}
		System.out.println();
		}
	}
}
