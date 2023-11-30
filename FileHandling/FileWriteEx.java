import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
    public static void main(String[] args) {
         try
        {
         FileWriter fWrite=new FileWriter("CreatFileEx.txt");
        fWrite.write("hey there! this is an writing file code example"); 
        fWrite.close();       
        }
        catch(IOException e)
        {
            System.out.println("unable to create file"+e);
        }

    }
    
}
