//QNO15:-Design A Method To Find Largest Number Of 3 Numbers
class LargestThreeNum
{
	public static void main(String[] args) 
	{
		findLargest(24,7,15);
	}
	public static void findLargest(int a,int b,int c)
	{
		System.out.println(a>b && a>c ? "A Is Greater : "+a : b>a && b>c ? "B Is Greater : "+b : "C Is Greater : "+c);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>A Is Greater:-24							*
*************************************************/