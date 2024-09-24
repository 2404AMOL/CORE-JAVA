class TernaryOperator
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=5;
		int d=155;
		int e=100;
		
		System.out.println(a>b && a>c && a>d && a>e?"A is Greater":b>c && b>d && b>e?"B Is Greater":c>d && c>e?"C is Greter":d>e?"D is Greater":" E is Greter");

	}
}
