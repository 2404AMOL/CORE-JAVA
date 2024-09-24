//Private Members Are Accesible Only That Class Only 
//Private Member Are Not Accessible For Outside Class
//Inside That Class We Can Modify The Private Membes
class Student
{
	private String name;
	private int rollNo;
	private String email;
	private double fee;

	public void display()
	{
		System.out.println(this.name+" : is good in Java");
	}

	public void getData()
	{
		System.out.println(this.name);
		System.out.println(this.rollNo);
		System.out.println(this.email);
		System.out.println(this.fee);
	}

	Student(String name,int rollno,String email,double fee)
	{
		this.name = name;
		this.rollNo = rollno;
		this.email = email;
		this.fee = fee;
	}

}
