/*QNO2=Write A Program Demo Of Else If Ladder
1.If Number is divible by 2 and 5 then print "Hi"
2.If Number is divible by 7 and 3 then print "Bye"
3.If Number is divible by 2 and 9 then print "GoodBye"
otherwise Print "Block".*/

class Program1 
{
	public static void main(String[] args) 
	{
		int num=10;

		if (num%2==0 && num%5==0)
		{
			System.out.println("Hi");
		}
		else if (num%7==0 && num%3==0)
		{
			System.out.println("Bye");
		}
		else if (num%2==0 && num%9==0)
		{
			System.out.println("GoodBye");
		}
		else
		{
			System.out.println("Block");
		}
	}
}
