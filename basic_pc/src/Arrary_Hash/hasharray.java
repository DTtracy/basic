package Arrary_Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class hasharray {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
        ArrayList<String> array = new ArrayList<String>();
        array.add("诸葛亮");
        array.add("赵云");
        hm.put("三国演义", array);
        ArrayList<String> array2 = new ArrayList<String>();
        array2.add("唐僧");
        array2.add("孙悟空");
        hm.put("西游记", array2);
        ArrayList<String> array3 = new ArrayList<String>();
        array3.add("武松");
        array3.add("鲁智深");
        hm.put("水浒传", array3);
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }
    }
}
