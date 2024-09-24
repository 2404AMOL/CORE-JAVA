class CurlyBlocks 
{
	int a=10;
	public static void main(String[] args) 
	{
		{
			System.out.println("Hello World!");

			{
			System.out.println("Hello World!");

				{
					System.out.println("Hello World!");
					CurlyBlocks obj = new CurlyBlocks();
					System.out.println(obj.a);
				}
			}

		}
		
	}
}

//Inside the Main method we declare the multiple {} [blocks]
//This Block is considered as Independent Block.
//This Block is Not considered as Non-Static Block it is an Independent Block.
//This block is Executly Automatically 

