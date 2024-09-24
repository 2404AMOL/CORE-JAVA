class Print5num 
{
	public static void main(String[] args) 
	{
		int[] n = new int[5];

		int a=1;

		for (int i=0;i<n.length;i++)
		{
			n[i] = a++;
			System.out.println(n[i]);
		}
	}
}
