import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderExample {

    public static void main(String[] args) {

        FileReader fileReader = null;
        PushbackReader pushbackReader = null;
        try {
            fileReader = new FileReader("C:/Users/PRANOTI PATIL/OneDrive/Desktop/codeJava/CharecterStream/abc.txt");
            pushbackReader = new PushbackReader(fileReader);
            char c[] = new char[15];
            System.out.print("Characters read:");

            if (pushbackReader.ready()) {
                pushbackReader.read(c);
                for (int i = 0; i < 15; i++) {
                    System.out.print(c[i]);
                }
            }

            System.out.println("");
            System.out.println("PushedBack Character:" + c[0]);
            pushbackReader.unread(c[0]);
            System.out.print("PushedBack Character read again:");
            if (pushbackReader.ready()) {
                System.out.print((char) pushbackReader.read());
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
            if (pushbackReader != null)
                try {
                    pushbackReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

}