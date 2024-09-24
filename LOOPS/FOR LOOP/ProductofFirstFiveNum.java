//QNO12:-Write A Program To find the Product of First five Numbers
class ProductofFirstFiveNum 
{
	public static void main(String[] args) 
	{
		int mul=1;
	

		System.out.println("The First Five Numbers Are:-");
		for (int num=1;num<=5;num++)
		{
			System.out.println(num);
			mul*=num;
		}
		System.out.println("Product of Five Number is : "+mul);

	}
}
/********************************************
--------------->>>>>OUTPUT>>>>--------------*
*********************************************
-->>1										*
-->>2										*
-->>3										*
-->>4										*
-->>5										*
The Product Of First Five Numbers Are:-120	*
*********************************************/