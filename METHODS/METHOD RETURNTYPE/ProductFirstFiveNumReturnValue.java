//QNO12:-Design A Method To Find The Product Of First Five Numbers An Return Value Back

class ProductFirstFiveNumReturnValue 
{
	public static int product()
	{	
		int mul=1;
		System.out.println("The First Five Numbers Are:-");
		for (int num=1;num<=5;num++)
		{
			System.out.println(num);
			mul=mul*num;
		}
		return mul;
	}
	public static void main(String[] args) 
	{
		int res=product();
		System.out.println("The Product Of First Five Numbers Are:-"+res);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>The First Five Numbers Are:-
-->>1
-->>2
-->>3
-->>4
-->>5
-->>The Product Of First Five Numbers Are:-120
*************************************************/