//QNO7:-Design A Method To Calculate Area Of Circle
class AreaOfCircle
{
	public static void main(String[] args) 
	{
		findArea(5);
	}
	public static void findArea(double radius)
	{
		double PI = 3.14;
		double area = radius * radius * PI;
		System.out.println("Area is : " +area);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>The Area Of Circle Is: 78.5					*
*************************************************/