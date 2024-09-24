//QNO7:-Write A Program to Count All The Vowels Between A to Z 
class CountVowelsAtoz
{
	public static void main(String[] args) 
	{
		int count=0;
		char ch='a';

		do
		{
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println(ch);
				count++;
			}
			ch++;
		}
		while (ch<='z');
		System.out.println("Total Count : "+count);
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
Vowels Are:-						*
-->>a								*
-->>e								*
-->>i								*
-->>o								*
-->>u								*
Count Of Vowels:-5					*
*************************************/