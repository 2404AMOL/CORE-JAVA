class StaicVarValAssign 
{
	static int var;
	static
	{
		var=20;
		System.out.println(var);
		StaicVarValAssign.var=101;
		System.out.println(var);
	}
	public static void main(String[] args) 
	{
		var=50;
		System.out.println(var);
	}
}
