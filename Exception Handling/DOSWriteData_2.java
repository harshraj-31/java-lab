import java.io.*;

class DOSWriteData
{
    public static void main(String[] args) throws IOException
    {
        // Create DataOutputStream with FileOutputStream
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));

        // writeInt() → writes integer (4 bytes)
        dos.writeInt(100);  
        
        //writeDouble() → writes double value
        dos.writeDouble(74.74);

        // writeChar() → writes single character
        dos.writeChar('K');



        dos.close();

    }
    
}