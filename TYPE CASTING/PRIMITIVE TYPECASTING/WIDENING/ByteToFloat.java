//QNO4:-Write A Program TO Convert The Byte To Float
class ByteToFloat 
{
	public static void main(String[] args) 
	{
		byte a=97;
		//1.Directly
		float b=a;
		System.out.println(b);

		//2.Using Cast Operator
		float c=(float)a;
		System.out.println(c);
	}
}

//==>The Float is bigger datatype so it has decimal fraction
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>97.0							*
*************************************/