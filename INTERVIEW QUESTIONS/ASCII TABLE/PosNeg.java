//Que:-Check if a Number is Positive or Negative in Java
class PosNeg 
{
	public static void main(String[] args) 
	{
		int num=-2;

//======================================================================/
		//1st way Using Ternary Operator

		/*String res=num>0?"Positive":"Negative";
		System.out.println(res);*/
		//System.out.println(a>0?"Positve":"Negative");
//======================================================================/
		//2nd Method Using If Else
		/*if (num>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}*/
//======================================================================/
		//3rd way Using Using Nested If
		/*if (num>=0)
		{
			if(num==0)
			{
				System.out.println("Zero");
			}
			else
			{
				System.out.println("Positive");
			}	
		}
		else
		{
			System.out.println("Negative");
		}*/
//======================================================================/
		//4th way
		if (num>0)
		{
			System.out.println("Positive");
		}
		else if (num<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}

	}
}
