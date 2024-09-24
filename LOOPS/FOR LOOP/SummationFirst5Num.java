//QNO15:-Write A Program To Print Summation Of First Five Numbers
class SummationFirst5Num 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for (int num=1;num<=5;num++)
		{
			sum+=num;
		}
		System.out.println("Summation is : "+sum);
	}
}
/********************************************
--------------->>>>>OUTPUT>>>>--------------*
*********************************************
The First Five Numbers Are:-				*
-->>1										*
-->>2										*
-->>3										*
-->>4										*
-->>5										*
The Summation Of First Five Numbers Are:-15	*
*********************************************/