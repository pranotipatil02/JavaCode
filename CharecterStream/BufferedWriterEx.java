import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedWriter bw = null;
        String data = "Testing data";

        try {
            fw = new FileWriter("C:/Users/PRANOTI PATIL/OneDrive/Desktop/codeJava/CharecterStream/bufferwriteex.txt");
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.flush();
            System.out.println("Data written to File");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            // Closing the streams
            if (fw != null)
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (bw != null)
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

}