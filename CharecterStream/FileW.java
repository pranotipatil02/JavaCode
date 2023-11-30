import java.io.FileWriter;
import java.io.IOException;

public class FileW {
public static void main(String[] args) throws IOException{
    FileWriter f=null;
    try
    {
       f=new FileWriter("C:/Users/PRANOTI PATIL/OneDrive/Desktop/codeJava/CharecterStream/FileW.txt");
        
       f.write("Hey there");
        f.close();
    }
    catch(Exception e)
    {
      System.out.println(e);  
    }
}    
}
