import java.io.*;

class BufferedReaderExample
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("new.txt"));
        
        //Stores one line of text from file
        String line;

        //Reads one full line (not character) Returns: 
        //Line as String null → when file ends
        while((line=br.readLine())!=null)
        {
            System.out.println(line);
        }

        br.close();
    }
}


// 💡 Key Difference in Your Doubt

// Concept	    FileReader Version	BufferedReader Version

// Read method	        read()	        readLine()
// Store in	            int ch	        String line
// End check	        != -1	        != null
// Conversion needed    (char) ch	    ❌ Not needed