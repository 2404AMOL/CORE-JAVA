//QNO4:-Write A Program To Demo Of Continue Keyword

class ContinueDemo  
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");//1
		int a=0;

		while (a<5)/*{True0}*//*{True1}*//*{True2}*//*{True3}*//*{True4}*//*{false5}*/
		{
			System.out.println("Hi");//2//4//6//8//10

			if (a==2)/*{false0}*//*{false1}*//*{True2}*//*{false3}*//*{false4}*/
			{
				System.out.println("Goodbye");//7
				a++;//3
				continue;//It Transfer Control To The Begining Of The Loop i.e /*{While Lopp}*/
			}
		System.out.println("Bye");//3//5//9//11
		a++;//1//2//4//5
		}
		System.out.println("Main End");	//12
		System.out.println(a);
	}
}
/*******************OUTPUT*******************/
//Main Start								*
//Hi										*
//Bye										*
//Hi										*
//Bye										*
//Hi										*
//Goodbye									*
//Hi										*
//Bye										*
//Hi										*		
//Bye										*
//Main End									*
/********************************************/