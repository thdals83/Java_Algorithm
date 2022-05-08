package 자료구조;

import java.util.HashMap;
import java.util.Map;

public class HashMaptest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("11", 2);
        map.put("22", 3);
        map.put("11", 2);
        map.put("33", 4);
        map.remove("11");
        map.put("11", 2);
        //map.clear();

        System.out.println(map);
        System.out.println(map.get("11"));

        //entrySet()사용
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
        //KeySet() 사용
        for(String i : map.keySet()){
            System.out.println(i + map.get(i));
        }
    }
}
