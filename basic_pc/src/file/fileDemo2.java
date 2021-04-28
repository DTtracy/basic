package file;

import java.io.File;
import java.io.IOException;

public class fileDemo2 {
    public static void main(String[] args) throws IOException {
        File f = new File("basic_pc\\java.txt");
        System.out.println(f.delete());
    }
}
