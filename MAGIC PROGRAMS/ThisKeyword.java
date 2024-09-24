class ThisKeyword 
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println(this.a);
	}
}
/*We cannot use Super & this inside the Static context.*/
/*ThisKeyword.java:6: error: non-static variable this cannot be referenced from a static context
                System.out.println(this.a);*/