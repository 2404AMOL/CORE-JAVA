class Animal 
{
	public void nature()
	{
		System.out.println("Eating");
	}
}
class ConstructorInfinte extends Animal
{

	public void nature()
	{
		System.out.println("Barking");
	}

	public void test()
	{
		//this.nature();
		ConstructorInfinte oCI = new ConstructorInfinte();
		oCI.nature();

		Animal oA = oCI;
		oA.nature();
	}

/*	{
		//this.nature();
		ConstructorInfinte oCI = new ConstructorInfinte();//Infinite Because Non-Static Block Automatcally Executed 
		//and calls Constructor Multiple times.
		oCI.nature();

		//Animal oA = oCI;
		//oA.nature();

		oCI.test();
	}*/
	public static void main(String[] args) 
	{
		ConstructorInfinte oCI = new ConstructorInfinte();
		oCI.nature();
		oCI.test();

		Animal oA = oCI;
		oA.nature();
	}
}

