class Employee 
{
	String eName;
	int iEmpID;

	Employee()
	{
		iEmpID=0;
		eName="";
	}
	Employee(String name,int iD)
	{
		eName=name;
		iEmpID=iD;
	}

	public void getData()
	{
		System.out.println("The Employee Name Is:-"+eName);
		System.out.println("The Employee ID IS:-"+iEmpID);
	}
}

class Worker extends Employee
{
	float OverTimeSalary;

	Worker()
	{
		OverTimeSalary=0.0f;
	}
	Worker(String n,int id,float s)
	{
		super(n,id);
		OverTimeSalary=s;
	}
	void display()
	{
		System.out.println("The OverTime Salary Is:-"+OverTimeSalary);
	}

	public static void main(String args[])
	{
		Worker oW=new Worker("Tushar",12,54646.55f);
		oW.getData();
		oW.display();
	}
}

class Manager extends Employee
{
	float AddAllowance;

	Manager()
	{
		AddAllowance=0.0f;
	}
	Manager(String n,int id,float s)
	{
		super(n,id);
		AddAllowance=s;
	}
	void display()
	{
		System.out.println("The OverTime Salary Is:-"+AddAllowance);
	}

	public static void main(String args[])
	{
		Manager oM = new Manager("Amol",12,54646.55f);
		oM.getData();
		oM.display();
	}
}