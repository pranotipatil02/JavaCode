import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedExample {
    public static void main(String[] args) {

        // create a new Piped writer and reader
        PipedWriter pipedWriter = new PipedWriter();
        PipedReader pipedReader = new PipedReader();
        String data1 = "Piped data contents1";
        int totalChars1 = data1.length();
        String data2 = "Piped data contents2";
        int totalChars2 = data2.length();

        try {
            // connect the PipedReader and the PipedWriter
            pipedWriter.connect(pipedReader);

            // write data1
            pipedWriter.write(data1);
            System.out.print("Reading characters one by one:");
            if (pipedReader.ready()) {
                for (int i = 0; i < totalChars1; i++) {
                    // Reading one character at a time
                    System.out.print((char) pipedReader.read());
                }

            }
            // write data2
            pipedWriter.write(data2);
            System.out.println("");
            System.out.print("Reading characters into char Array:");
            char c[] = new char[totalChars2];
            if (pipedReader.ready()) {
                pipedReader.read(c);
                for (int i = 0; i < totalChars2; i++) {
                    System.out.print(c[i]);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            // Closing the streams
            if (pipedWriter != null)
                try {
                    pipedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (pipedReader != null) {
                try {
                    pipedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}