/*
	11111
	22222
	33333
	44444
	55555
*/
class Pattern1
{
	public static void main(String[] args) 
	{
		int num=1;
		for (int r=1;r<=5;r++)
		{
			for (int c=1;c<=5;c++)
			{
				System.out.print(num);
			}
			num++;
			System.out.println();
		}
	}
}
