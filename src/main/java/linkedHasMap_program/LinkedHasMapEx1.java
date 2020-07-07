package linkedHasMap_program;

import java.util.LinkedHashMap;

public class LinkedHasMapEx1 {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> limap =  new LinkedHashMap<Integer, String>();

        limap.put(1111, "Alfa");
        limap.put(3333, "Beta");
        limap.put(676767, "Novem");
        limap.put(8788, "jdhfdfj");

        System.out.println("Keys details:" +limap.keySet());    // keySet () method is used to display only the key details

        System.out.println("Value details:" +limap.values());   // values() method is used to display only the values

        System.out.println("key-value pairs:" +limap.entrySet());   // entrySet() method is used to display both the keys & values of the elements
    }
}
