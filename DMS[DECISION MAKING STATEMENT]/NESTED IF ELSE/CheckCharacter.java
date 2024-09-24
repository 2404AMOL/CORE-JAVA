class CheckCharacter 
{
	public static void main(String[] args) 
	{
		char ch='a';

		if (ch>='a' && ch<='e')
		{
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println(ch + " : Given Charcater is Vowels");
			}
			System.out.println(ch + " : This is Lowercase Character");
		}
		else
		{
			if (ch=='A' || ch=='Z')
			{
				System.out.println(ch + " : This is Uppercase Character");
			}
			else
			{
				if (ch=='0' || ch=='9')
				{
					System.out.println(ch + " : You have Entered Digit");
				}
				else
				{
					System.out.println("This is Special Character");
				}
			}
		}
	}
}
