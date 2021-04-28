package io;

import java.io.*;

public class FileOutPutStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream src = new FileInputStream("H:\\test\\java.txt");
        FileOutputStream dest = new FileOutputStream("basic_pc\\java.txt");

        int by;
        while ((by = src.read())!= -1){
            dest.write(by);
        }
        src.close();
        dest.close();
    }
}
