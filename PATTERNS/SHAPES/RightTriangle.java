class RightTriangle 
{
	public static void main(String[] args) 
	{
		int n=11;
		for (int r=1;r<2*n;r++)
		{
			int colInRow= r > n ? 2 * n-r : r;

			for (int c=1;c<colInRow ;c++ )
			{
				System.out.print(" "+"*");
			}
		System.out.println();
		}
	}
}
