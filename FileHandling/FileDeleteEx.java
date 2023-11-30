import java.io.File;
import java.io.IOException;

public class FileDeleteEx {
    public static void main(String[] args) throws IOException {
        File f=new File("xyz.txt");
      if(f.delete())
      {
        System.out.println("I have deleted "+f.getName());
      }
      else
      {
        System.out.println("some problems are occured while deleting file");
      }
    }
    
}
