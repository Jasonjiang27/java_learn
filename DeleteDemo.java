import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteDemo {
    public static void main(String[] args) {
        try {
            //删除文件，文件必须存在，否则抛出异常
            Files.delete(Paths.get("/home/project/3.txt"));
            //删除文件，返回是否删除成功 即使文件不存在，也不会保存，直接返回false
            System.out.println(Files.deleteIfExists(Paths.get("/home/project/3.txt")));
            //或者使用File类的Delete方法
            File file = new File("/home/project/4.txt");
            System.out.println(file.delete());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}