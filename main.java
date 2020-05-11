
import java.io.File;

public class Main {
    public static boolean rename(String oldname, String newname) {
        // 旧的文件
        File file = new File(oldname);
        // 新的文件名
        File file2 = new File(newname);
        // 重命名
        return file.renameTo(file2);
    }
    public static void main(String[] args) {
        System.out.println("Rename file:" + rename("G:\\test\\nowcoder.txt", "G:\\test\\nowcoder2.txt"));
        System.out.println("Rename directory:" + rename("G:\\test", "G:\\testdata"));
    }
}