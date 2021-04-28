package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bos = new BufferedReader(new FileReader("basic_pc\\array.txt"));
        ArrayList<String> array = new ArrayList<String>();
        String line;
        while((line=bos.readLine())!=null){
            array.add(line);
        }
        bos.close();
        for(String s : array){
            System.out.println(s);
        }
    }
}
