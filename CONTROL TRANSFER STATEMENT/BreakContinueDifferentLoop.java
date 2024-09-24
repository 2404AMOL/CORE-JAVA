//QNO1:-Write A Program To Check Use Of Both Break & Continue Keyword Together Inside A Different Block
class BreakContinueDifferentLoop
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		int a=0;

		while (a<5)
		{
			System.out.println("Hi");
			if (a==2)
			{
				System.out.println("GoodBye");
				a++;
				continue;
			}
			System.out.println("Bye");
			a++;
			break;
		}
		System.out.println("Main End");
	}
}
//We Can Use The Both Keyword In Program The Diffrent Loops

/***********************OUTPUT***********************/
//Main Start										*
//Hi												*
//Bye												*
//Main End											*