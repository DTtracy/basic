package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        BufferedWriter bw = new BufferedWriter(new FileWriter("basic_pc\\array.txt"));

        for(String s : array){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
