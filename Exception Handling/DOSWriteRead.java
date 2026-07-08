import java.io.*;

public class DOSWriteRead {
    public static void main(String[] args) throws IOException {
        
        // Writing data
        DataOutputStream dos = new DataOutputStream(
            new FileOutputStream("data.txt")
        );
        
        dos.writeInt(10);
        dos.writeDouble(3.14);
        dos.writeUTF("Hello");
        dos.writeChar('K');
        dos.close();

        // Reading data
        DataInputStream dis = new DataInputStream(
            new FileInputStream("data.txt")
        );
        
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());
        System.out.println(dis.readChar());
        dis.close();
    }
}

                    // DataInputStream

// Class	            Method	             Description

// DataInputStream	    readInt()	        Reads integer
// DataInputStream	    readDouble()	    Reads double
// DataInputStream	    readBoolean()	    Reads boolean
// DataInputStream	    readChar()	        Reads character
// DataInputStream	    readUTF()	        Reads string


                    // DataOutputStream

// DataOutputStream	    writeInt(int)	        Writes integer
// DataOutputStream	    writeDouble(double)	    Writes double
// DataOutputStream	    writeBoolean(boolean)   Writes boolean
// DataOutputStream	    writeChar(char)	        Writes character
// DataOutputStream	    writeUTF(String)	    Writes string