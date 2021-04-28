package Arrary_Hash;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CountTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = scanner.nextLine();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            Integer value = hm.get(c);
            if (value == null) {
                hm.put(c, 1);
            } else {
                value++;
                hm.put(c, value);
            }

        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for(Character key : keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String toString = sb.toString();
        System.out.println(toString);
    }
}
