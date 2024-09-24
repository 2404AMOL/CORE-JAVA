class LocalVariable 
{
	public static void main(String[] args) 
	{

		/*Syntax
			Datatype variableName = value
		*/

		//1.Variable declaration
		int a;
		//System.out.println(a);//CTE :  variable a might not have been initialized
		a=10;//Assigning a value/Initialization of Variable
		System.out.println(a);

		a=20;//Re-Assigning / Re-Initialization
		System.out.println(a);

		//2.Declaration with Initialization
		int b=20;


		//3.Re-Declaration;
		//int a;//CTE :  variable a is already defined in method main(String[])

		//4.Re-Declaration with Initialization
		//int a=20;//CTE :variable a is already defined in method main(String[])

		int c,d,e,f;//You Can declare more than one Variable.

		int var1=10,var2=20,var3=30;//You can declare and initialize variable at same line.
		System.out.println(var1);


		
	}
}
/*
==> Local Variable declared inside the Method Block,Static Block,COnstructor Block.
==>	Local Variable deos not have default value.
==> Local Variable initailization is mandatory beacuse if you declared local variable,
	without value at the time of accessing Compiler give error.

*/