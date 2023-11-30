/* 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferReaderEx {
    public static void main(String[] args) 
    {
        Reader r=null;
        BufferedReader br=null;
   try{
         r=new FileReader("C:/Users/PRANOTI PATIL/OneDrive/Desktop/codeJava/CharecterStream/abc.txt");
    BufferedReader b=new BufferedReader(r);
    System.out.println("Is mark supported: "+b.markSupported());
   br=new BufferedReader(br);
   System.out.println("Is marked supported: "+br.markSupported());
   if(br.markSupported())
   {
    br.mark(10);
   }
   br.skip(5);
   System.out.println("After skip file content: ");
   while(br.ready())
   {
    System.out.println((char)br.read());
   }
   br.reset();
   System.out.println("after reset file content using readline");
   while(br.ready())
   {
     System.out.println(br.readLine());
   }
   br.reset();
   System.out.println("");
   System.out.println("Readinhg charecter into char array ");
char ch[]=new char[10];
if(br.ready())
{
    br.read(ch);
    for(int i=0;i<=10;i++)
    {
        System.out.println((char)i);
    }
}

}
catch(IOException e)
{
e.printStackTrace();
}
finally
{
    if(r!=null)
    {
     try
     {
        r.close();
     }
     catch(IOException e)
     {
        e.printStackTrace();
     }
     if(br!=null)
     {
        try
        {
            br.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
     }
    }
}    
}
}
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferReaderEx {

    public static void main(String[] args) {

        Reader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader("C:/Users/PRANOTI PATIL/OneDrive/Desktop/codeJava/CharecterStream/abc.txt");
            // Created BufferedReader with the underlying Reader
            br = new BufferedReader(reader);
            // Check if markSupported by BufferedReader
            System.out.println("Is Mark Supported:" + br.markSupported());
            if (br.markSupported()) {
                // marks the current position
                // 10 characters to be read before the mark position becomes invalid
                br.mark(10);
            }
            // Skip 5 characters of data
            br.skip(5);
            System.out.print("After Skip File Content:");
            // Checks if the stream is ready to be read
            while (br.ready()) {
                // Reading one character for each loop
                System.out.print((char) br.read());
            }
            // Resets to the earlier marked position
            br.reset();
            System.out.println("");
            System.out.print("After Reset File Content using readLine:");
            while (br.ready()) {
                // Using readLIne to read one line for each loop
                System.out.print(br.readLine());
            }
            // Resetting again to the earlier marked position
            br.reset();
            System.out.println("");
            System.out.print("Reading characters into char Array:");
            char c[] = new char[10];
            if (br.ready()) {
                br.read(c);
                for (int i = 0; i < 10; i++) {
                    System.out.print(c[i]);
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            // Closing the streams
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

}