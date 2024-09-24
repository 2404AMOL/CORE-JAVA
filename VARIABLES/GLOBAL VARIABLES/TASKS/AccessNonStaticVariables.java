//QNO1:-How Many Ways we can Acess the Non-Static Variables.
class AccessNonStaticVariables 
{
	int a=10;

	public void display()
	{
		System.out.println(a);//Local/Static/Non-Static
		//System.out.println(AccessNonStaticVariables.a);//CTE :  non-static variable a cannot be referenced from a static context
		System.out.println(this.a);//Using This Keyword
	}
	public static void main(String[] args) 
	{
		AccessNonStaticVariables obj = new AccessNonStaticVariables();
		obj.display();
		//System.out.println(a);//CTE : directly Not Form Static Context
		//System.out.println(AccessNonStaticVariables.a);//CTE :  non-static variable a cannot be referenced from a static context
		System.out.println(obj.a);//Using Object Reference.
		//System.out.println(this.a);//CTE :  non-static variable this cannot be referenced from a static context
	}
}
/* Access Non-Static Varaibles
1.Using Object Reference Variable.
2.Using directly By its Name But it Only from Non-Static Context(MembersArea);
3.Using this Keyword But it Only from Non-Static Context(MembersArea);
*/