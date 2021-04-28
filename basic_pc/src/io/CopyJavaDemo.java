package io;

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader src = new InputStreamReader(new FileInputStream("H:\\test\\java.txt"));
        OutputStreamWriter des = new OutputStreamWriter(new FileOutputStream("basic_pc\\java.txt"));
        char bys[] = new char[1024];
        int len;
       while((len=src.read(bys))!=-1){
           des.write(bys);
       }
       src.close();
       des.close();
    }
}
