class CheckCharacter 
{
	public static void main(String[] args) 
	{
		char ch='A';

		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch + " : Given Character is Vowel");
		}
		else if (ch>='A' && ch<='Z')
		{
			System.out.println(ch + " : Given Character is Uppercase Letter");
		}
		else if (ch>='a' && ch<='z')
		{
			System.out.println(ch + " : Given Character is Lowercase Letter");
		}
		else if (ch>='0' && ch<='9')
		{
			System.out.println(ch + " : You Have Entered Digit");
		}
		else 
		{
			System.out.println("This is SPecial Character");
		}

	}
}
