//QNO6:-Write A Program To Find Product Of Fisrt Five Characters
class FindProductOfFirstFiveCharacters
{
	public static void main(String[] args) 
	{
		char ch='a';
		long mul=1;

		while (ch<='e')
		{
			mul*=ch;
			ch++;
		}
		System.out.println(mul);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>9505049400									*
*************************************************/