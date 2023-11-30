import java.io.*;
import java.util.Scanner;
public class FileReadEx {
    public static void main(String[] args) {
       try
       {
          File f=new File("CreatFileEx.txt");
       Scanner sc=new Scanner(f);
       while(sc.hasNextLine())
       {
        String line=sc.nextLine();
        System.out.println(line);
       }
       sc.close();
       }
       catch(FileNotFoundException e)
       {
        e.printStackTrace();
       }
    
    }
    
}
