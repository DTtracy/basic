package io;

import java.io.*;

public class BufferStreamDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("basic_pc\\bos.txt"));
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        bos.close();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("basic_pc\\bos.txt"));
        int by;
        while((by=bis.read()) != -1){
            System.out.print((char)by);
        }

        bis.close();

    }
}
