import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) {
        try
        {
            FileWriter writer=new FileWriter("output.txt");
            writer.write("Hello, World");
            writer.close();

        FileReader reader=new FileReader("output.txt");
        int charecter;
        while((charecter=reader.read())!=-1)
        {
           System.out.print((char)charecter+" ");
        }
        reader.close();

        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
}
