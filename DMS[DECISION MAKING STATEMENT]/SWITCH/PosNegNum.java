class PosNegNum 
{
	public static void main(String[] args) 
	{
		int num=3;

		int check=num>0 ? 1 : num<0 ? 2 : 3;

		switch (check)
		{
			case 1: {
				System.out.println("Positive");
				break;
			}
			case 2: {
				System.out.println("Negative");
				break;
			}
			default: {
				System.out.println("Zero");
			}
		}
	}
}
