class equalsMethod 
{
	public static void main(String[] args) 
	{
		equalsMethod obj = new equalsMethod();
		equalsMethod obj1 = new equalsMethod();

		System.out.println(obj==obj1);//Compare Two Address of the Object
		System.out.println(obj.equals(obj1));//Compare two State of the Object
	}
}
