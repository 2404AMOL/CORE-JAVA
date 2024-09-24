class WithoutMain
{
	static 
	{
		System.out.print("JAVA HOW TO");
		System.exit(0);
	}

}
/*
==>We can Compile Program without main method we niether get any Compile Time Error.
==>But At the RunTime we get an Exception
==>Error: Main method not found in class WithoutMain, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/