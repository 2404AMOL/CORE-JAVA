class EligibleToVote 
{
	public static String checkEligible(int num)
	{
		if (num>=18)
		{
			return "You Are Eligible For Voting";
		}
		else
		{
			return "You Are Not Eligible Go Home Watch POGO";
		}
	}
	public static void main(String[] args) 
	{
		String res=checkEligible(15);
		System.out.println(res);
	}
}
