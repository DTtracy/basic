package Arrary_Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class arrayhash {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("孙策", "大乔");
        map1.put("周瑜", "小乔");
        array.add(map1);
        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("郭靖", "黄蓉");
        map2.put("杨过", "小龙率");
        array.add(map2);
        HashMap<String, String> map3 = new HashMap<String, String>();
        map3.put("令狐冲", "任盈盈");
        map3.put("林平之", "岳灵珊");
        array.add(map3);
        for (HashMap<String, String> s : array) {
            Set<String> keySet = s.keySet();
            for (String key : keySet) {
                String value = s.get(key);
                System.out.println(key + value);
            }
        }

    }
}
