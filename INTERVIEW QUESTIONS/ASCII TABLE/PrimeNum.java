//Write a program to check if a given number is prime or not in java
/*A natural number greater than 1 that is not prime is called a composite number. For example, 5 is prime because the only ways of writing it as a product, 1 � 5 or 5 � 1, involve 5 itself.*/

class PrimeNum
{
	public static void main(String[] args) 
	{


		/*If the count of factors for this number is > 2 then
		It�s not prime else it�s prime
		A prime number must only be divisible by 1 and the number itself.*/
		//Method 1: Simple iterative solution


		/*int n=5;
		int count=0;
		 // negative numbers, 0 and 1 are not prime
		if (n < 2)
		  {
		System.out.println ("The given is number " + n + " is not prime");
		System.exit (0);
		  }
		// checking the number of divisors b/w [1, n]
		for (int i = 1; i <= n; i++)
		  {
		if (n % i == 0)
		  count += 1;
		  }

		// if count of divisors greater than 2 then its not prime 
		if (count > 2)
		  System.out.println ("The given is number " + n + " is not prime");

		else
		  System.out.println ("The given is number " + n + " is prime");

		}*/

		//Method 2: Optimization by break condition

		int i, n = 13;
		boolean isprime = true;

     // 0 and 1 are not prime numbers also, negative numbers are not prime
		if (n < 2)
		{
          isprime = false;
		}
		else
		{
		  for (i = 2; i < n; i++)
           {
            if (n % i == 0)
             {
              isprime = false;
                  break;
                }
			}
       }

     String result = isprime ? "Prime" : "not Prime";
     System.out.println ("The number " + n + " is : " + result);

     // Time Complexity : O(N)
     // Space Complexity : O(1)
     // This program is better than previous version as :
     // Condition for 0, 1 and negative numbers checked earlier
     // Loops runs b/w [2, n-1] rather than [1, n]
	}
}
