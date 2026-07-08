public class NESTEDTRYDEMO
{
    public static void main(String args[])
    {
        try   
        {
            try   
            {
                int arr[] = {10,20,30};
                System.out.println(arr[5]);  
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("INNER CATCH : INVALID INDEX");
            }

            int result = 10/0;   
        }
        catch(ArithmeticException e)
        {
            System.out.println("OUTER CATCH : Division by zero");
        }
        finally
        {
            System.out.println("PROGRAM END");
        }
    }
}