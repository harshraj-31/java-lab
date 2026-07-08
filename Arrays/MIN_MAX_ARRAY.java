import java.util.*;
class MIN_MAX_ARRAY
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ELEMENTS:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(a[i] < min)
                min = a[i];
            if(a[i] > max)
                max = a[i];
        }
        System.out.println("MIN VALUE IS: " + min);
        System.out.println("MAX VALUE IS: " + max);
    }
}