//QN013:-Write A Program To Convert Char To Long
class CharToLong
{
	public static void main(String[] args) 
	{
		char ch='a';
		//Directly
		long a=ch;
		System.out.println(a);

		//2.Cast Operator
		long b=(long)ch;
		System.out.println(b);
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>97								*
*************************************/
