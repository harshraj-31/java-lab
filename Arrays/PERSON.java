class PERSON
{
	String n;
	
	public PERSON(String n)
	{
		this.n=n;
	}
	@Override
	public String toString()
	{
		return "PERSON[name:'"+n+"']";
	}
	
	public static void main(String args[])
	{
		PERSON p = new PERSON("IBEST");
		
		System.out.println(p.toString());
		System.out.println(p);
		
		System.out.println(p.hashCode());
	}
}
