import java.io.FileWriter;
import java.io.IOException;

class FileWriterEx
{
    public static void main(String[] args) throws IOException {
        FileWriter f=null;//initially u should provide null value
        try
        {
            f=new FileWriter("C:/Users/PRANOTI PATIL/OneDrive/Desktop/codeJava/CharecterStream/xyz.txt");
            f.write("Hey There, this file indicate example of filewriter class");
            f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}