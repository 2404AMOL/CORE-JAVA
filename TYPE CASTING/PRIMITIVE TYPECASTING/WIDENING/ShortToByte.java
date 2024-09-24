//QNO15:-Write A Program To Convert The Short To byte
class ShortToByte 
{
	public static void main(String[] args) 
	{
			short a=97;
			//1.Directly
			byte b=a;//CTE
			System.out.println(b);

			//2.Cast Operator
			byte c=(byte)a;
			System.out.println(c);
			
	}
}
/*ShortToByte.java:8: error: incompatible types: possible lossy conversion from short to byte
                        byte b=a;//CTE
                               ^
1 error*/

//==>This is because a short is 2 byte
//==>Byte is 1 byte