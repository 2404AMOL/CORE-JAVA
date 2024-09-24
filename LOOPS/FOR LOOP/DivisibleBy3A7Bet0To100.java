//QNO3:-Write A Program To Print The Numbers Which Are Divisible By 3 & 7 Between 0 to 100
class DivisibleBy3A7Bet0To100 
{
	public static void main(String[] args) 
	{
		int count=0;

		for (int num=0;num<=100;num++)
		{
			if (num%3==0 && num%7==0)
			{
				System.out.println(num);
				count++;
			}
		}
		System.out.println("Total Count is : "+count);
	}
}
/********************************************
--------------->>>>>OUTPUT>>>>--------------*
*********************************************
-->>0										*
-->>21										*
-->>42										*
-->>63										*
-->>84										*
*********************************************/