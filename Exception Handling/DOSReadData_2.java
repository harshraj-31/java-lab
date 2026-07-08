import java.io.*;

class DOSReadData
{
    public static void main(String[] args) throws IOException
    {
        DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));

        //readInt() reads integer
        int a = dis.readInt();

        //readDouble() → reads double
        double b = dis.readDouble();

        // readChar() → reads character
        char c = dis.readChar();

        System.out.println("Integer: "+a);
        System.out.println("Double: "+b);
        System.out.println("Character: "+c);

        dis.close();

    }
}