class CheckCharacter 
{
	public static void main(String[] args) 
	{
		char ch='0';

		if (ch>='a' && ch<='e')
		{
			
			System.out.println(ch + " : This is Lowercase Character");
		}
		else
		{
			System.out.println(ch + " : This is Not Lowercase Character");
		}
		if (ch>='A' && ch<='Z')
		{
			
			System.out.println(ch + " : This is Uppercase Character");
		}
		else
		{
			System.out.println(ch + " : This is Not Uppercase Character");
		}
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch + " : Given Charcater is Vowels");
		}
		else
		{
			System.out.println(ch + " : Given Charcater is Not Vowels");
		}
		if (ch=='0' || ch=='9')
		{
			System.out.println(ch + " : You have Entered Digit");
		}
		else
		{	
			System.out.println(ch + " : This is Not Digit");
		}
		
	}
}
