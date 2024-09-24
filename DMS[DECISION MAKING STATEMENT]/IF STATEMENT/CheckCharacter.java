class CheckCharacter 
{
	public static void main(String[] args) 
	{
			char ch='a';

			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println(ch + " : Vowels");
			}
			if (ch>='A' && ch<='Z')
			{
				System.out.println(ch + " : Given Character is Uppercase");
			}
			if (ch>='a' && ch<='z')
			{
				System.out.println(ch + " : Given Character is Lowercase");
			}
			if (ch>='0' && ch<='9')
			{
				System.out.println(ch + " : You Entered Digit");
			}
			if (ch=='@' || ch=='#' || ch=='$' || ch=='*')
			{
				System.out.println(ch + " : This is Special Character");
			}
			if (ch=='+' || ch=='-' || ch=='*' || ch=='/')
			{
				System.out.println(ch + " : This is Arithematic Signs");
			}
	}
}
