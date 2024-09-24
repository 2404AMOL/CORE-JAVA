//QNO12:-Write A Program To Convert The Char To Int

class CharToInt 
{
	public static void main(String[] args) 
	{
		char ch='a';
		//1.Directly
		int a=ch;
		System.out.println(a);

		//2.Cast Operator
		int b=(int)ch;
		System.out.println(b);
	}
}

//==>We can Convert The Char To Double Because char has small and Double is large Datatype.
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>97								*
*************************************/
