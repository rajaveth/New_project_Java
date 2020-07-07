package map_program;

import java.util.HashMap;
import java.util.Map;

public class HasMapEx6 {

    public static void main(String[] args) {

        // To use replace () method

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "aaa");
        map.put(2, "bbb");
        map.put(3, "ddd");

        System.out.println("Number of elements:" +map);

        for (Map.Entry m: map.entrySet()){

            System.out.println(m.getKey()+" "+m.getValue());
        }

        map.replace(3, "ccc");
        for (Map.Entry e: map.entrySet()){

            System.out.println(e.getKey()+" "+e.getValue());
        }

        map.replaceAll((k,v) ->"Raja");
        for (Map.Entry b: map.entrySet()){

            System.out.println(b.getKey()+" "+b.getValue());
        }
    }
}
