//QNO1:-Write A Java Program For Display The Employee Name, Emp-id,City, Salary

class Employee 
{
	int iEmpId;
	String strName;
	String strCity;
	double dSalary;

	Employee()
	{
		iEmpId=0;
		strName="";
		strCity="";
		dSalary=0.0;
	}
	Employee(int ID,String n,String c, Double s)
	{
		iEmpId=ID;
		strName=n;
		strCity=c;
		dSalary=s;
	}

	void display()
	{
		System.out.println("The Employee Id="+iEmpId);
		System.out.println("The Employee Name:-"+strName);
		System.out.println("The Employee City:-"+strCity);
		System.out.println("The Employee Salary:-"+dSalary);
	}
	public static void main(String[] args) 
	{
		Employee oE = new Employee(22,"Amol","Pune",50000.00);
		oE.display();
	}
}
