import java.util.*;
import java.io.*;

class COPY_LINE_BY_LINE
{
    public static void main(String args[])
    {
        String source = "COPY_LINE_BY_LINE.java";
        String destination = "COPY_LINE_BY_LINE";

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(source));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destination));

            String line;

            while((line = br.readLine()) != null)
            {
                lineCount++;

                charCount += line.length();

                if(line.trim().length() != 0)
                {
                    wordCount += line.split("\\s+").length;
                }

                // COPY + UPPERCASE
                bw.write(line.toUpperCase());
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("FILE COPY DONE");
            System.out.println("TOTAL LINES: => " + lineCount);
            System.out.println("TOTAL WORDS: => " + wordCount);
            System.out.println("TOTAL CHARACTERS: => " + charCount);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}