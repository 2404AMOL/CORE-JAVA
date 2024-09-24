//QNO3:-Write A Program Print First Five Character And Store Into Array
class PrintFirstFiveCharacterStoreArray 
{
	public static void main(String[] args) 
	{
		char[] character = new char[5];

		char ch = 'a';

		for (int i=0;i<character.length;i++)
		{
			character[i] = ch++;
			System.out.println(character[i]);
		}
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>a								*
-->>b								*
-->>c								*
-->>d								*
-->>e								*
*************************************/