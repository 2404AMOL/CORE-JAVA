class Signal 
{
	public static void main(String[] args) 
	{
		String str="Red";

		switch (str)
		{
		case "Red": {
				System.out.println("Stop..Wait For Green Signal");
			break;
		}
		case "Green": {
				System.out.println("Now tou can Go");
			break;
		}
		case "Yellow": {
				System.out.println("you can Walk Now");
			break;
		}
		default: {
			System.out.println("You have Wrong Value");
		}

		
		}
	}
}
