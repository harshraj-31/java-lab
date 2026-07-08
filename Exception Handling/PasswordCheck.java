import java.util.*;
class PasswordCheck 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try 
		{
            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            int length = password.length();
            System.out.println("PASSWORD LENGHT: " + length);
            if (length < 6)
				{
                throw new IllegalArgumentException("ARE BHAI 6 DEGIT JOYE CHEE " +length+" SU KAM  NAKHE CHEE TUU");
            } 
			else 
			{
                System.out.println("HAAL TARO MED AAVI GYOO");
            }
        } 
        catch (IllegalArgumentException e) 
		{
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}