class BOOK
{
	
	String title;
	BOOK(String title)
	{
		this.title=title;
	}
	@Override
	public boolean equals(Object obj)
	{
		
		BOOK b = (BOOK) obj;
		return this.title.equals(b.title);
	}
	public static void main(String args[])
	{
		BOOK b1= new BOOK("JAVA");
		BOOK b2= new BOOK("JAVA");
		
		System.out.println(b1.equals(b2));
	
	}
}