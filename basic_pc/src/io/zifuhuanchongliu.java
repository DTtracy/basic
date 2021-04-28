package io;

import java.io.*;

public class zifuhuanchongliu {
    public static void main(String[] args) throws IOException {
        BufferedReader src = new BufferedReader(new FileReader("H:\\test\\java.txt"));
        BufferedWriter des = new BufferedWriter(new FileWriter("basic_pc\\java.txt"));
        char bys[] = new char[1024];
        int len;
        while((len=src.read(bys))!=-1){
            des.write(bys);
        }
        src.close();
        des.close();
    }
}
