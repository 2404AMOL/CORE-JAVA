//QNO1:-Perform Method ReturnType Using Non-Static Method
class NonStaticMethodReturnType
{
	int a=15;
	int b=15;

	int display()
	{
		int res=a+b;
		return res;
	}
	int display(int a,int b)
	{
		int res=a*b;
		//System.out.println(res);
		return res;
	}
	public static void main(String[] args) 
	{
		NonStaticMethodReturnType oNMR =new NonStaticMethodReturnType();
		System.out.println(oNMR.display());
	
		int res=oNMR.display(50,50);
		System.out.println(res);
	}
}
