package io;

import java.io.*;

public class CopyJavaDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader src = new BufferedReader(new FileReader("H:\\test\\java.txt"));
        BufferedWriter des = new BufferedWriter(new FileWriter("basic_pc\\java.txt"));
        String line;
        while ((line=src.readLine())!=null){
            des.write(line);
            des.newLine();
            des.flush();
        }
        src.close();
        des.close();
    }
}
