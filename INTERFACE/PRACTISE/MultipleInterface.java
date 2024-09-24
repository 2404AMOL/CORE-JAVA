interface One
{
	default void one()
	{
		System.out.println("one-()");
	}
}
interface Two
{
	default void two()
	{
		System.out.println("two-()");
	}
}
interface Three
{
	default void three()
	{
		System.out.println("three-()");
	}
}
interface Four
{
	default void four()
	{
		System.out.println("four-()");
	}
}
interface Five
{
	default void five()
	{
		System.out.println("five-()");
	}
}
class MultipleInterface implements One,Two,Three,Four,Five
{
	public static void main(String[] args) 
	{
		MultipleInterface oMI = new MultipleInterface();
		oMI.one();
	}
}
