import java.io.IOException;
import java.io.StringReader;

public class StringReaderExample {

    public static void main(String[] args) {

        StringReader stringReader = null;
        String str = "Reading String Data";
        try {
            stringReader = new StringReader(str);
            // Check if markSupported by StringReader
            System.out.println("Is Mark Supported:" + stringReader.markSupported());
            if (stringReader.markSupported()) {
                // marks the current position
                // 100 characters to be read before the mark position becomes invalid
                stringReader.mark(100);
            }
            // Skip 5 characters
            stringReader.skip(5);
            System.out.print("After Skip Content:");
            // Checks if the stringReader is ready to be read
            if (stringReader.ready()) {
                for (int i = 0; i < 14; i++) {
                    // Reading one character at a time
                    System.out.print((char) stringReader.read());
                }

            }
            System.out.println("");
            // Reset to the earlier marked position
            System.out.println("Reset to the earlier marked position");
            stringReader.reset();
            System.out.print("Reading characters into char Array:");
            char c[] = new char[20];
            if (stringReader.ready()) {
                stringReader.read(c);
                for (int i = 0; i < 20; i++) {
                    System.out.print(c[i]);
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            // Closing the streams
            if (stringReader != null)
                stringReader.close();
        }

    }

}