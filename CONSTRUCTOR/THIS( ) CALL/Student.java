class Student
{

	Student()
	{
		this("Amol");

	}

	Student(String name)
	{
		this(23);
		System.out.println("The Name Of The Staudent IS:-"+name);
	}

	Student(int age)
	{
		System.out.println("The Age Of Student Is:-"+age);
	}
	
	public static void main(String[] args) 
	{
		Student oS = new Student();
	}
}
