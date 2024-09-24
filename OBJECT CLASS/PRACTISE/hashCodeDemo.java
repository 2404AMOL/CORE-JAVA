class hashCodeDemo
{
	int n=700;

	public int hashCode()
	{
		return n++;
	}

	public static void main(String[] args) 
	{
		hashCodeDemo oP1 = new hashCodeDemo();
		hashCodeDemo oP2 = new hashCodeDemo();

		System.out.println(oP1.hashCode());
		System.out.println(oP1.hashCode());
		System.out.println(oP2.hashCode());
	}
}
