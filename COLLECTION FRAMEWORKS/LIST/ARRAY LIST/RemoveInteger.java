import java.util.ArrayList;
import java.lang.Integer;
class RemoveInteger
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();

		obj.add(123);
		obj.add(5);
		obj.add(155);
		obj.add('A');
		obj.add(true);
		obj.add(false);
		System.out.println(obj);

		//Remove objects using the with the help of index_value
		obj.remove(1);
		System.out.println(obj);

		//Remove objects using the objects Name
		obj.remove(false);
		System.out.println(obj);

		//Here we are trying access the by Directly by Element
		//But it Considered As Index Value
		//So Its  the Problem With Integer Type Of Data to Remove it.
		//obj.remove(155);//Here We get RunTime Exception Called ClassNotFoundException

		//So We Take The Help of valueOf() Method of Wrapper Classes
		
		System.out.println(Integer.valueOf(155));
		obj.remove(Integer.valueOf(155));
		System.out.println(obj);

	}
}
