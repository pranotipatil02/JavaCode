import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterEx {

    public static void main(String[] args) {

        CharArrayWriter charArrayWriter = null;
        try {
            charArrayWriter = new CharArrayWriter();
            charArrayWriter.write(" data1 ");
            charArrayWriter.write(" data2 ");
            charArrayWriter.write(" data3 ");
            char[] chars = charArrayWriter.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i]);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Closing the streams
            if (charArrayWriter != null)
                charArrayWriter.close();
        }

    }

}