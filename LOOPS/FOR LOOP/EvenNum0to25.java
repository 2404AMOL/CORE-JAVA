//QNO4:-Write A Program To Print All The Even Numbers Between O to 25
class EvenNum0to25 
{
	public static void main(String[] args) 
	{
		int count=0;

		for (int num=1;num<=25;num++)
		{
			if (num%2==0)
			{
				System.out.println(num);
				count++;
			}
		}
		System.out.println("Total Even Num is : "+count);

		/*for(num=0;num<25;num++)
		{
			if (num%2==0)
			{
				System.out.println(num);
			}
		}*/

		/*for (int num=0;num<25;num++)
		{
			System.out.println(num);
			num+=1;
		}*/

		/*for (num=0;num<25;num++)
		{	
			System.out.println(num);
			num=num+1;
		}*/


		/*for (num=0;num<25;num+=2)
		{
			System.out.println(num);		
		}*/

		/*for (System.out.println("Even Numbers");num<25;num+=2)
		{
			System.out.println(num);		
		}*/

		/*for (System.out.println("Even Numbers:-");num<25;System.out.print(""))
		{
			System.out.println(num);
			num+=2;		
		}*/
	}
}
/********************************************
--------------->>>>>OUTPUT>>>>--------------*
*********************************************
Even Numbers:-								*
-->>0										*
-->>2										*
-->>4										*
-->>6										*
-->>8										*
-->>10										*
-->>12										*
-->>14										*
-->>16										*
-->>18										*
-->>20										*
-->>22										*
-->>24										*
*********************************************/