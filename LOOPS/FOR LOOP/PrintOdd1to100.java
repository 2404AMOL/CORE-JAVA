//QNO11:-Write A Program To Print All The Odd Numbers Between 1 to 100
class PrintOdd1to100 
{
	public static void main(String[] args) 
	{
		for (int num=1;num<=100;num++)
		{
			if (num%2==1)
			{
				System.out.println(num);
			}
		}
	}
}
