class NoOfDays 
{
	public static void main(String[] args) 
	{
		int Days=30;

		switch (Days)
		{
		case 28 :
				System.out.println("Months :"+" Febuary");
		break;
		case 29 :
				System.out.println("Months :"+" Febuary");
		break;

		case 30 : 
				System.out.println("Months :"+" April" + "\tJune" + "\tSeptember" + "\tNovember");
		break;

		case 31 :
				System.out.println("Months :"+" January" + "\tMarch" + "\tMay" + "\tJuly" + "\tAugust" + "\tOctomber" + "\tDecember");
		break;
		default:
				System.out.println("Enter a Valid Value");
		}
	}
}
