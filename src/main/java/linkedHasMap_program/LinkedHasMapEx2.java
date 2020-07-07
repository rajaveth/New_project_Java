package linkedHasMap_program;

import java.util.LinkedHashMap;

public class LinkedHasMapEx2 {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

        map.put(0001, "String");
        map.put(0002, "Hash");
        map.put(0003, "map");
        map.put(0004, "Tree");

        System.out.println("Printing all the elements before removing the elements:" +map);

        map.remove(0002);

        System.out.println("Printing all the elements after removing the elements:" +map);
    }
}
