//QNO5:-Design A Method To Calculate The Simple Interest And Return The Result
class SimpleInterestReturnResult
{	
	public static float calSimpleInterest(float P, float R,float T)
	{
		float SI=(P*R*T)/100;
		//System.out.println("Simple Interest = " + SI);
		return SI;
	}
	public static void main(String[] args) 
	{
		System.out.println(calSimpleInterest(10000,5,5));
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>2500.0										*
*************************************************/