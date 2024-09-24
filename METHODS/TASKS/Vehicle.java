class Vehicle 
{
	String Name;
	int Price;
	String Color;

	Vehicle(String n, int p,String c)
	{
		this.Name=n;
		this.Price=p;
		this.Color=c;
	}

	public static void main(String[] args) 
	{
		Vehicle V1 = new Vehicle("Thar",700000,"Black");
		Vehicle V2 = new Vehicle("Bulero",120000,"White");

		System.out.println(V1);
		System.out.println(V2);
	}


	public String toString()
	{
			return "Name:"+Name+"Price:-"+Price+"Color:-"+Color;
	}
}