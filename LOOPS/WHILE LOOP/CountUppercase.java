//QNO10:- Write a Program to count All Uppercase Letters
class CountUppercase
{
	public static void main(String[] args) 
	{
		char ch='A';
		int count=0;

		while (ch<='Z')
		{
			count++;
			System.out.println(ch);
			ch++;
		}
		System.out.println("Total Alphabets is : "+count);
	}
}
