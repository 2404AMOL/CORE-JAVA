//QNO16:-Write A Program To Print The Summation Of Division By 3 and 9 Between 0 To 100
class SummationOfDivBy3A9Bet0To100 
{
	public static void main(String[] args) 
	{
		int sum=0;

		for (int num=1;num<=100;num++)
		{
			if (num%3==0 && num%9==0)
			{
				System.out.println(num);
				sum+=num;
			}
		}
		System.out.println("The Summation is : "+sum);
	}
}
/****************************************************************
---------------------------->>>>>OUTPUT>>>>---------------------*
*****************************************************************
The Division By 3 & 9 Numbers Between 0 To 100 Are:-			*
-->>0															*
-->>9															*
-->>18															*
-->>27															*
-->>36															*
-->>45															*
-->>54															*
-->>63															*
-->>72															*
-->>81															*
-->>90															*
-->>99															*
The Summation Of Divisible By 3 & 9 Between 0 To 100 Are:-594	*
*****************************************************************/