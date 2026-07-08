import java.io.*;

class DATA_OUTPUT_STREAM
{
    public static void main(String args[]) throws Exception
    {
      
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("IN_OUT_STREAM"));
        
        dout.writeInt(1);
        dout.writeUTF("JAY");
        dout.writeDouble(90.5);
        dout.writeChar('M');
        
        dout.close();
        
        // Reading same file
        DataInputStream din = new DataInputStream(new FileInputStream("IN_OUT_STREAM"));
        
        System.out.println(din.readInt());
        System.out.println(din.readUTF());
        System.out.println(din.readDouble());
        System.out.println(din.readChar());
        
        din.close();
    }
}