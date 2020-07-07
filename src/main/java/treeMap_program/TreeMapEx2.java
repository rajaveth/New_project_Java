package treeMap_program;

import java.util.*;

public class TreeMapEx2 {

    public static void main(String[] args) {


        TreeMap<Integer, String> map = new TreeMap<Integer, String>();


        map.put(101, "Balasubramaniam");
        map.put(234, "Vasudevan");
        map.put(111, "Saran");
        map.put(100, "Chitra");

        System.out.println("Elements in decending order:" +map.descendingMap());    // decending order  ---> large to small
        System.out.println("head map details:" +map.headMap(111, true));
        System.out.println("tail map details:" +map.tailMap(111, true));
        System.out.println("key & value details between the range" +map.subMap(100, false, 234, true));
    }
}
