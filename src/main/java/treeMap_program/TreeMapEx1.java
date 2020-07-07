package treeMap_program;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        map.put(101, "Balasubramaniam");
        map.put(234, "Vasudevan");
        map.put(111, "Saran");
        map.put(100, "Chitra");

        for (Map.Entry en: map.entrySet()){

            System.out.println(en.getKey()+" "+en.getValue());
        }
    }
}
