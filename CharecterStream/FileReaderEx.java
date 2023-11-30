import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader f=null;
        try
        {
          f=new FileReader("C:/Users/PRANOTI PATIL/OneDrive/Desktop/codeJava/CharecterStream/xyz.txt");
          int i;
          while((i=f.read())!=-1)
          {
           System.out.print((char)i);
          }
          f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
