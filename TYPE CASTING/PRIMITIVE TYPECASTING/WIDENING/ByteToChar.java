//QNO2:-Write A Program To Convert The Byte To Char
class ByteToChar 
{
	public static void main(String[] args) 
	{
		byte a=97;
		//1.Directly
		char b=a;//CTE
		System.out.println(b);

		//2.Cast Operator
		char c=(char)a;
		System.out.println(c);
	}
}
/****************************************************************************************
==>If we trying to convert the Byte To Char it is not possible.
==>char is unsigned (has a range of 0 to 2^16 - 1), so -1 is not within its range.
==>byte, on the other hand, is signed, and has a range of -128 to 127. 
==>Therefore, even though a b byte is represented by half the bits of a char, not all the possible

===>ByteToChar.java:7: error: incompatible types: possible lossy conversion from byte to char
                char b=a;
                       ^
==>So we need to take the help of cast operator.
*****************************************************************************************/
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>a								*
*************************************/