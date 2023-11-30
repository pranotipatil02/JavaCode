package p2;
import p1.Logger;
public class ProtectedEx extends Logger {
    public static void main(String[] args) {
        ProtectedEx o=new ProtectedEx();
        o.debug("Hey | main is Hello");
    }
}
