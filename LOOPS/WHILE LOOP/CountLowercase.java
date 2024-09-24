//QNO13:- Write a Program to count All Lowercase Letters
class CountLowercase
{
	public static void main(String[] args) 
	{
		char ch='a';
		int count=0;

		while (ch<='z')
		{
			count++;
			System.out.println(ch);
			ch++;
		}
		System.out.println("Total Alphabets is : "+count);
	}
}
