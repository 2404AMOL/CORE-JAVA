class Static$NonStaticVar 
{

	static int a=10;
	int b=20;

	static
	{
		System.out.println(a);//==>Local(NotPresent)==>Static(NotPresent)==>Nonstatic
														//Present//10
		int a=30;
		System.out.println(a);//==>Local(Present)#(NP)==>Static(NotPresent)==>Nonstatic//30
												
		System.out.println(Static$NonStaticVar.a);//Directly Static Var ==>10
									//Class Name As Refernce
								
		Static$NonStaticVar obj=new Static$NonStaticVar(); 
		System.out.println(obj.b); //object reference variable =>20
		System.out.println(obj.a); //Object Refernce Var =>10

	}

	{
		System.out.println(a); //d--l==>s 10
		System.out.println(Static$NonStaticVar.a); //a 10
		System.out.println(this.a);//using this keyword 10
		System.out.println(b);//d--l==>s==>ns 20
		System.out.println(this.b);//with help this keyword 20

	}

	public static void main(String[] args) 
	{
		
	}
}