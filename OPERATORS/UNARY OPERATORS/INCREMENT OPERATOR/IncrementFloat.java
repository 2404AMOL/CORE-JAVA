//QNO2:-Can We Perform Increment Operator For Float Datatype
class IncrementFloat
{
	public static void main(String[] args) 
	{
		float a=11.11f;//12.11
		float b=22.22f;//23/22
		float c=a++;//11.11
		float d=++b;//23.22
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>12.11							*
-->>23.22							*
-->>11.11							*
-->>23.22							*
*************************************/