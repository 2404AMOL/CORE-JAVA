class StringIndexOutOfBounds 
{
	public static void main(String[] args) 
	{
		String str="ABCD";

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));//==>RunTime Exception

	}
}
/* StringIndexOutOfBoundsException
==>StringIndexOutOfBoundsException is Runtime Exception.
==>Here We get StringIndexOutOfBoundsException
==>Here No 4 IndexValue is Present and We are Trying to Access It.
==>Runtime Exception Occurs During The RunTime
==>It is Compiler Unawaire Exception
==>Means Your Program Suddenly Stopped While Running
==>So Compiler Does No About It
*/