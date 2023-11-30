import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderExample {

    public static void main(String[] args) {

        CharArrayReader charReader = null;
        String str = "Reading CharArray Data";
        char[] chars = str.toCharArray();
        int totalChars = str.length();
        try {
            charReader = new CharArrayReader(chars);
            // Check if markSupported by CharArrayReader
            System.out.println("Is Mark Supported:" + charReader.markSupported());
            if (charReader.markSupported()) {
                // marks the current position
                // 100 characters to be read before the mark position becomes invalid
                charReader.mark(100);
            }
            // Skip 5 characters
            charReader.skip(5);
            System.out.print("After Skip Content:");
            // Checks if the CharArrayReader is ready to be read
            if (charReader.ready()) {
                for (int i = 0; i < totalChars - 5; i++) {
                    // Reading one character at a time
                    System.out.print((char) charReader.read());
                }

            }
            System.out.println("");
            // Reset to the earlier marked position
            System.out.println("Reset to the earlier marked position");
            charReader.reset();
            System.out.print("Reading characters into char Array:");
            char c[] = new char[totalChars];
            if (charReader.ready()) {
                charReader.read(c);
                for (int i = 0; i < totalChars; i++) {
                    System.out.print(c[i]);
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            // Closing the streams
            if (charReader != null)
                charReader.close();
        }

    }

}