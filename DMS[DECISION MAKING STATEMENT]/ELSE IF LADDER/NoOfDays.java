//QNO3=Write A Program To Print Number Of days Present In The Given Month Using Else If Ladder
class NoOfDays 
{
	public static void main(String[] args) 
	{
		String month="January";

		if (month=="January" || month=="March" || month=="May" || month=="July" || month=="August" || month=="Octomber" || month=="December")
		{
			System.out.println(month + " : Consist of 31 Days");
		}
		else if (month=="April"|| month=="June" || month=="September" || month=="November")
		{
			System.out.println(month + " : Consist of 30 Days");
		}
		else
		{
			System.out.println(month + " : Consist of 28 or 29 Days");
		}
	}
}
