class ArrayIndexOutOfBoundsException
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		int[] arr = new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);//Exception
		System.out.println("Main Ends");
	}
}
