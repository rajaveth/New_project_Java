package treeMap_program;

import java.util.*;

public class TreeMapEx3 {

    public static void main(String[] args) {

        SortedMap<Integer,String> map = new TreeMap<Integer, String>();

        map.put(1234, "arun");
        map.put(2345, "higher");
        map.put(3456, "king");
        map.put(4567, "lion");

        for (Map.Entry net: map.entrySet()){

            System.out.println(net.getKey()+" "+net.getValue());
        }

        System.out.println(map.headMap(3456));

        System.out.println(map.tailMap(2345));

        System.out.println(map.subMap(1234, 3456));

    }
}
