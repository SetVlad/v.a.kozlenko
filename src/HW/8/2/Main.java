import java.io.RandomAccessFile;

/**
 * Created by systemadministrator on 19.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        byte[] buf = new byte[10];

        RandomAccessFile in = new RandomAccessFile("C:\\1.txt","rw");
        try {
            in.seek(100);
            in.write(buf);
            in.writeInt(7);
            in.writeChars(“hello !!!”);
            …
            intx = in.readInt();
            Boolean b = in.readBoolean();
        } finally {
            in.close();
        }
    }
}
