//QNO11:-Design A Method To Check Given Character Is Vowel or Not
class CheckVowel 
{
	public static void main(String[] args) 
	{
		checkVowel('a');
	}
	public static void checkVowel(char ch)
	{
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println(ch+" : Given Character Is Vowel");
		}
		else
		{
			System.out.println("Given Character IS Not Vowel");
		}
	}
}
