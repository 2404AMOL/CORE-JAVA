//QNO4:-Write A Program To Count The Even Number In The Array And Print
class ToCountEvenNumInArray 
{
	public static void main(String[] args) 
	{
		int n[]={1,2,4,7,9,10,12};

		int count=0;
		
		for(int index=0;index<n.length;index++)
		{
			if (n[index]%2==0)
			{
				count++;
			}
			System.out.println(n[index]);
		}
		System.out.println("Total Even Numbers:-"+count);	
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>1								*
-->>2								*
-->>4								*
-->>7								*
-->>9								*
-->>10								*
-->>12								*
-->>Total Even Numbers:-4			*
*************************************/