//QNO22:- Write a Program to Print Even Numbers Between 1 to 25
class PrintEven1To25
{
	public static void main(String[] args) 
	{
		int num=1;
		int count=0;
		while (num<=25)
		{
			if (num%2==0)
			{
				System.out.println(num);
				count++;
			}
			num++;
		}
		System.out.println("Total Count : "+count);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>2											*
-->>4											*
-->>6											*
-->>8											*
-->>10											*
-->>12											*
-->>14											*
-->>16											*
-->>18											*
-->>20											*
-->>22											*
-->>24											*
*************************************************/