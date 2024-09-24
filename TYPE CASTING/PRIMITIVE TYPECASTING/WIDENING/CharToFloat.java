//QNO11:-Write A Program To Convert The Char To Float
class CharToFloat
{
	public static void main(String[] args) 
	{
		char ch='a';
		//1.Directly
		float a=ch;
		System.out.println(a);

		//2.Cast Operator
		float b=(float)ch; 
		System.out.println(b);
	}
}
//==>We can Convert The Char To Double Because char has small and Double is large Datatype.
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>97.0							*
*************************************/