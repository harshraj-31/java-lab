class Calc
{
    public static void main(String[] args)
    {
        int a=Integer.parseInt(args[0]);
        char opr = args[1].charAt(0);
        int b=Integer.parseInt(args[2]);

        switch(opr)
        {
            case '+':
                System.out.println(a+" + "+b+" = "+(a+b));
                break;     

            case '-':
                System.out.println(a+" - "+b+" = "+(a-b));
                break;   
            
            case '*':
                System.out.println(a+" * "+b+" = "+(a*b));
                break;   

            case '/':
                System.out.println(a+" / "+b+" = "+(a/b));
                break;   
        }
    }
}