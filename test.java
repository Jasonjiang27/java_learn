import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class test{
    public void copy(InputStream in, OutputStream out) throws IOException {
        byte[] buf = new byte[4096];
        int len = in.read(buf);
        //read 是一个字节一个字节地读，字节流结尾标志是-1
        while (len != -1){
            out.write(buf, 0, len);
            len = in.read(buf);
        }
    }
    public static void main(String[] args) throws IOException{
        test t = new test();
        System.out.println("输入字符：");
        t.copy(System.in, System.out);
    }
}