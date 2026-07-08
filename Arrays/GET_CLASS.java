public class GET_CLASS
{
	public static void main(String args[])
	{
		Object o = new String("GET CLASS METOD DEMO");
		Class c =o.getClass();
		System.out.println("CLASS OF OBJECT O\n" +c.getName());
	}

}