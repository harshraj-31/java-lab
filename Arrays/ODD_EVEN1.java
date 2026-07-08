class ODD_EVEN1 
{
    public static void main(String args[])
    {
        int no = Integer.parseInt(args[0]);

        if (no % 2 == 0)
        {
            System.out.println(no + " is even");
        }
        else
        {
            System.out.println(no + " is odd");
        }
    }
}
