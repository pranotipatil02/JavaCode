import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class LineNumberReaderExample {

    public static void main(String[] args) {

        FileReader fileReader = null;
        LineNumberReader lineNumberReader = null;
        try {
            fileReader = new FileReader("C:/Users/PRANOTI PATIL/OneDrive/Desktop/codeJava/CharecterStream/abc.txt");
            lineNumberReader = new LineNumberReader(fileReader);
            String line = lineNumberReader.readLine();
            while (line != null) { 
                int lineNumber = lineNumberReader.getLineNumber(); 
                System.out.println("line" + lineNumber + "->" + line); 
                line = lineNumberReader.readLine(); 
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (fileReader != null)
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (lineNumberReader != null)
                try {
                    lineNumberReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

}