/* Perform Following Task
1.If Number is divible by 3 and 7 then Print "Hi".
2.If Number is Divible by 2 and 7 then Print "Bye".
3.If Number is Divible by 0 then print "Goodbye".
otherwise print "Block".
*/
class Program2 
{
	public static void main(String[] args) 
	{
		int num=4;

		if (num%3==0 && num%7==0)
		{
			System.out.println("Hi");
		}
		else if (num%2==0 && num%7==0)
		{
			System.out.println("Bye");
		}
		else if (num%2==0)
		{
			System.out.println("GoodBye");
		}
		else
		{
			System.out.println("Block");
		}
	}
}

