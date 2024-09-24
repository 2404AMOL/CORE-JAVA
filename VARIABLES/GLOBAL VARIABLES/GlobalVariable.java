class GlobalVariable 
{

	static byte a;
	static short b;
	static char c;
	static int d;
	static long e;
	static float f;
	static double g;
	static boolean h;
	static String str;


	public static void main(String[] args) 
	{
		System.out.println(a);//0
		System.out.println(b);//0
		System.out.println(c);// white space
		System.out.println(d);//0
		System.out.println(e);//0
		System.out.println(f);//0.0
		System.out.println(g);//0.0
		System.out.println(h);//true
		System.out.println(str);//null
	}
}

/*
==>Global Variable have a default values.
1.byte => 0
2.short => 0
3.char => White space
4.int => 0
5.long => 0
6.float => 0.0
7.double => 0.0
8.boolean => true
9.String => null

*/