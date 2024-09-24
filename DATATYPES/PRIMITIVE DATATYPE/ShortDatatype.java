class ShortDatatype 
{
	public static void main(String[] args) 
	{
		short sh=35;

		short a=32767;//Max Range
		short b=-32768;//Min Range
		short c=32768;//CTE : incompatible types: possible lossy conversion from int to short
		short d=-32769////CTE : incompatible types: possible lossy conversion from int to short
		System.out.println(sh);
	}
}

/* Range : -32,768 to 32,767*/
/* Size = 16bits = 2 byte