class Task3 
{
	public static void main(String[] args) 
	{
		int a=300;//301/302/303/304
		int b= ++a + a++ + ++a - a++;
		//     301 + 301 + 303 - 303
		//		905 - 303 =602
		boolean res=b>0;//true
		System.out.println(res);
	}
}
