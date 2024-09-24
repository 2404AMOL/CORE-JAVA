//QNO10:-Write A Program To Convert The Char To Double
class CharToDouble 
{
	public static void main(String[] args) 
	{
		char ch='a';
		//1.Directly
		double a=ch;
		System.out.println(a);

		//2.Cast Operator
		double b=(double)ch; 
		System.out.println(b);
	}
}
//==>We can Convert The Char To Double Because char has small and Double is large Datatype.
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>97.0							*
*************************************/