//QNO4:-Write A Program to Store First Five Even Numbers In An Array And Print The Array
class PrintFirstFiveEvenNumStoreToArray 
{
	public static void main(String[] args) 
	{
		int[] num = new int[10];

		int a=1;

		for (int i=0;i<num.length;i++)
		{
			num[i] = a++;

			if (num[i]%2 == 0)
			{
				System.out.println(num[i]);
			}
		}
	}
}
/************************************
--------->>>>>OUTPUT>>>>------------*
*************************************
-->>2								*
-->>4								*
-->>6								*
-->>8								*
-->>10								*
*************************************/