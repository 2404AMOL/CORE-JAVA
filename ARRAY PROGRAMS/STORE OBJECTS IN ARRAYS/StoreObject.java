class Student
{
	String name;
	int roll;
	
	Student(String name,int roll)
	{
		this.name = name;
		this.roll = roll;
		
	}
	
	public String toString()
	{
		return "Name :-"+name+"\nRollNo :-"+roll;	
	}
}
class StoreObject
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Amol",24);
		Student s2 = new Student("Ganesh",24);
		
		Student [] students = new Student[2];
		System.out.println(students);
		students[0] = s1;
		students[1] = s2;
		
		for(Student s: students)
		{
			System.out.println(s);
		}
	}
}