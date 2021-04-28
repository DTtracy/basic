package file;

import java.io.File;
import java.io.IOException;

public class fileDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("H:\\test\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("-------");

        File f2 = new File("H:\\test\\JavaSE");
        System.out.println(f2.mkdir());

    }
}
