class OverrideHashCode 
{
	//Ns-Variable
	int Eid;

	OverrideHashCode(int n)
	{
		this.Eid=n;
	}
	@Override
	public int hashCode()
	{
		return Eid;
	}

	public static void main(String[] args) 
	{
		OverrideHashCode oHC = new OverrideHashCode(100);
		System.out.println(oHC.hashCode());

		
		OverrideHashCode oHC1 = new OverrideHashCode(101);
		System.out.println(oHC1.hashCode());

	}
}
