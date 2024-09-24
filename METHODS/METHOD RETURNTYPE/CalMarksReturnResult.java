//QNO3:-Design A Method To Calculate Marks Of 4 Subjects
// i>If Any subject marks is less than 35 Print "fail".
// ii>If The Percentage Is Greater Than 80% Print "Distinction".
// ii>If The Percentage Is Greater Than 60% Print "First Class".
// iiI>If The Percentage Is Greater Than 50% Print "Second Class".
// ii>If The Percentage Is Below Than 50% Print "Pass".
class CalMarksReturnResult
{	
	public static String calMarks(int a,int b,int c,int d)
	{
		if (a<35 || b<35 || c<35 || d<35) 
			
		return "fail";
		
		float per=((a+b+c+d)*100)/400;
		System.out.println(per);

		if(per>80)
			{
				return "Distinction";
			}
			else if (per>60)
			{
				return "First Class";
			}
			else if (per>50)
			{
				return "Second Class";
			}
			else
			{
				return "Pass";
			}
	}
	public static void main(String[] args) 
	{
		System.out.println(calMarks(45,46,45,49));
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>46.0										*
-->>Pass										*
*************************************************/