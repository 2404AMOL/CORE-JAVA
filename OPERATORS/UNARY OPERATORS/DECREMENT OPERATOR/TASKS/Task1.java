class Task1
{
	public static void main(String[] args) 
	{
		int a=13;//12/11/10
		int b=11;//10/9
		int c=--a;//12/11/10
		System.out.println(a);//12

		int res1 = --c + a-- + b-- + --c + a-- + --b;
		//         11  + 12  +  11 +  10 + 11  +  9
		System.out.println(res1);//63
		System.out.println(a);//10
	}
}
