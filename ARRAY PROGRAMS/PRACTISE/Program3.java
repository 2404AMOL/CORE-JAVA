class Program3 
{
	public static void main(String[] args) 
	{
		int num[] = {1,2,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18};

		int even = 0;
		int odd = 0;

		for (int i=0;i<num.length;i++)
		{
			if (num[i]%2==0)
			{
				System.out.println("Even Numbers : "+num[i]);
					even++;
			}
			else
			{
				System.out.println("Odd Numbers : "+num[i]);
				odd++;
			}
		}
		System.out.println("Total Even Numbers Count : "+even);
		System.out.println("Totat Odd Numbers Count : "+odd);
	}
}
