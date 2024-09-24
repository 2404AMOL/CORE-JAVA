interface Mobile
{
	void call();
	void sms();
	void clickPhoto();
	void PlayGames();
	void watchMovies();
}

abstract class Xiomi implements Mobile
{
	public void call()
	{
		System.out.println("You can do Call");
	}
	public void sms()
	{
		System.out.println("You can do SMS");
	}
	public void clickPhoto()
	{
		System.out.println("You can Click Better Photos");
	}
	public void watchMovies()
	{
		System.out.println("You can Watch Movies");
	}
}
class Poco extends Xiomi
{
	
	public void PlayGames()
	{
		System.out.println("It Is a Gaming Phone");
	}
}


class Program6
{
	public static void main(String[] args) 
	{
		Poco oP=new Poco();
		
		Mobile oM=oP;
		oP.call();
		oP.PlayGames();
	}
}

