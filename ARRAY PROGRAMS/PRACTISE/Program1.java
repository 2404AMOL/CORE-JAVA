class Program1 
{
	public static void main(String[] args) 
	{
		int[] n = {1,2,3,4,5};

		System.out.println(n);//Address Of Array
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);
		System.out.println(n[4]);
		System.out.println(n[5]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        //at Program1.main(Program1.java:13)
	}
}
