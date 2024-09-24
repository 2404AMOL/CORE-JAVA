// isEmpty() Method

import java.util.ArrayList;

class CheckisEmpty
{
	public static void main(String[] args) 
	{
		ArrayList oA=new ArrayList();
		System.out.println(oA);
		//Calling Using Object Reference Variable
		System.out.println(oA.isEmpty());//Non-Static Boolean Type Method

		oA.add("Apple");
		oA.add("Mango");
		oA.add("Watermelon");

		System.out.println(oA.isEmpty());
	}
}

/*
==>isEmpty is A Non-Static Method
==>The Return Of isEmpty Method Is Boolean
==>We can isEmpty with the help Object Reference Variable
==>If Arraylist Empty is Return True
==>If ArrayyList is Not Empty Is Return False 
*/
