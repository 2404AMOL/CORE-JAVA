class MainMethodCalling
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Called");
		main(null);
	}
}

// We call the main method inside only the class
// We can call using two ways:
// By Passing the
//===>1.main(null)
//===>2.main(new String[0])

//We cannot call the main method form any other classes