interface A
{
	default void display()
	{
		System.out.println("A Says Hello");
	
	}
}
interface B
{
	default void display()
	{
		System.out.println("B Says Hello");
		//System.out.println(a);
	}
}
class MyClass implements A,B 
{
	public static void main(String[] args) 
	{
		MyClass oM = new MyClass();
		oM.display();
		//oM.display(15);
	}
}

//================================= NOTE ===========================================
//If both interface contains the same method header and we call using the child class
// Object Reference then the compiler confuse which method to call so it will throw
// an Compile time error called
//		(MyClass.java:17: error: class MyClass inherits unrelated defaults for display() from types A and B
//class MyClass implements A,B
//^
//====================================================================================