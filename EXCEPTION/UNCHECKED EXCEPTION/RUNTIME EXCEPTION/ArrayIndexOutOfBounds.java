class ArrayIndexOutOfBounds 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[4];

		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		//arr[4]=50;ArrayIndexOutOfBounds Exception
		
		System.out.println(arr[0]);
		System.out.println(arr[4]);//ArrayIndexOutOfBounds Exception
	
	}
}
