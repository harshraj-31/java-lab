class Pattern
{
    public static void main(String[] args)
    {
        int n=Integer.parseInt(args[0]);
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.err.print("*");
            }
            System.err.print("\n");
        }
    }
}