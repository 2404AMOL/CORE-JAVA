class School 
{
	public static void main(String[] args) 
	{
		Student oS = new Student("Amol",24,"24amolpawar@gmail.com",30000);
		oS.display();//Here Private Members Are Accessible Because The Dssplay() Method 
		//Is Member Of Student Class
		oS.getData();//Getter Method;

		oS.setData(35000);//Setter Method
		System.out.println(oS.getFee());//Getter Method

		//oS.name = "Ganesh";//CTE :  error: name has private access in Student
		//We cannot directly modify the value of variable which is private.

	}
}
