class Student 
{
	String name="Amol";
	int rollno=24;
}
interface Project
{
	int pmark=200;
}
abstract class Exam extends Student
{
	int iSub1=86,iSub2=87,iSub=85,iSub3=75,iSub4=97;

	int theory=iSub1+iSub2+iSub3+iSub4;

}
class Result extends Exam implements Project
{
	int Total=theory+pmark;

	double Per=((Total*100)/600);

	public void display()
	{
		System.out.println(Per);
	}
}

class Program5
{
	public static void main(String[] args) 
	{
		Result oR=new Result();
		oR.display();
	}
}
