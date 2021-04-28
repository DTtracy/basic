package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RandomName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("basic_pc\\name.txt"));
        ArrayList<String> array = new ArrayList<String>();
        String line;
        while((line=br.readLine())!=null){
            array.add(line);
        }
        br.close();
       Random r= new Random();
        int index = r.nextInt(array.size());
        String name = array.get(index);
        System.out.println(name);
    }
}
