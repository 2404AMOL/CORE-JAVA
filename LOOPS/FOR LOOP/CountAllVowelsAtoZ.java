//QNO1:-Write A Program To Count All The Vowels Between A To Z
class CountAllVowelsAtoZ 
{
	public static void main(String[] args) 
	{
		int count=0;
		for (char ch='a';ch<='z';ch++)
		{
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println(ch);
				count++;
			}
		}
		System.out.println("Total Count : "+count);
	}
}
/****************************************
----------->>>>>OUTPUT>>>>--------------*
*****************************************
-->>a									*
-->>e									*
-->>i									*
-->>o									*
-->>u									*
Total Numbers Of Vowels Are :-5			*
*****************************************/