//QNO3:-Write A Program Print Summation of First Five Number And Store Into An Array
class SummationFiveNumStoreArray 
{
	public static void main(String[] args) 
	{
		int n[]={1,2,3,4,5};

		int sum=0;
		

		for(int index=0;index<n.length;index++)
		{
			sum=sum+n[index];	
		}
		System.out.println(sum);
		
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>15								*
*************************************/