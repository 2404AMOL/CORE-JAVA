import java.io.*;
class FinallyBlockDemo 
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);

		}
		finally{
				System.out.println("File Is Created");
		}

	}
}