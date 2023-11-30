import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        try
        {
          File f=new File("CreatFileEx.txt");
        f.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println("unable to create file");
        }


        //write into file
    }
    
}
