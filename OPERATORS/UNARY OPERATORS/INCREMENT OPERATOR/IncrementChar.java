//QNO1:-Can We Perform Increment Operator For Char Datatype
class IncrementChar
{
	public static void main(String[] args) 
	{
		char ch='a';//b/c
		char ch1=ch++;//a
		char ch2=++ch;//c
		System.out.println(ch);//c
		System.out.println(ch1);//a
		System.out.println(ch2);//c
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>c								*
-->>a								*
-->>c								*
*************************************/