//QNO8:- Write a Program to print the All Characters with ASCII Values
class PrintASCII  
{
	public static void main(String[] args) 
	{
		int num=0;
		char ch;
		while (num<=200)
		{
			System.out.print(num +"\t");
			ch=(char)num;
			System.out.println(ch);	
			num++;
		}
	}
}
