class StringMethods 
{
	public static void main(String[] args) 
	{
		String str1="java";
		String str2="java";
		String str3=new String("Java ");

		System.out.println(str1.equals(str2));

		System.out.println(str1.equals(str3));

		System.out.println(str3.length());

		System.out.println(str1.equalsIgnoreCase(str3));

		System.out.println(str3.charAt(0));
		System.out.println(str1.toUpperCase());

		String str4="Class";
		System.out.println(str3.concat(str4));
	}
}
