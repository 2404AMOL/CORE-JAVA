class Declare$AccessNonStaticVar 
{
	byte a;
	short b;
	int c;
	long d;

	float e;
	double f;

	boolean g;

	String str;

	public static void main(String[] args) 
	{
		Declare$AccessNonStaticVar obj=new Declare$AccessNonStaticVar();
	
		System.out.println(obj.a);
		obj.a=10;
		System.out.println(obj.a);

		System.out.println(obj.b);
		obj.b=20;
		System.out.println(obj.b);

		System.out.println(obj.c);
		obj.c=30;
		System.out.println(obj.c);

		System.out.println(obj.d);
		obj.d=40;
		System.out.println(obj.d);

		System.out.println(obj.e);
		obj.e=50;
		System.out.println(obj.e);

		System.out.println(obj.f);
		obj.f=40;
		System.out.println(obj.f);

		System.out.println(obj.g);
		obj.g=true;
		System.out.println(obj.g);

		System.out.println(obj.str);
		obj.str="pass";
		System.out.println(obj.str);		
	}
}
