//QNO13:-Design A Method To Return A Value Back To Calling Method

class ReturnValue 
{
	public static int amol(int money)
	{
		System.out.println(money);
		int bet=money*2;
		System.out.println(bet);
		return 100;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hi");
		int n=amol(200);
		System.out.println("Bye");
		System.out.println(n);
	}
}
/************************************************
---------------->>>>>OUTPUT>>>>-----------------*
*************************************************
-->>Hi											*
-->>200											*
-->>400											*
-->>Bye											*
-->>100											*
*************************************************/