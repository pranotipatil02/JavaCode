import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class Create {
    public static void main(String[] args) throws IOException{
        // File f=new File("CreateFile.txt");
        // try
        // {
        //     f.createNewFile();
        // }
        // catch(IOException e)
        // {
        //     System.out.println(e);
        // }
        
        FileWriter fw=new FileWriter("CreateFile.txt");
        fw.write("Hey there");
        fw.close();

    }
    
}
