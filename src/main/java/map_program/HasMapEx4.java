package map_program;

import java.util.HashMap;
import java.util.Map;

public class HasMapEx4 {

    public static void main(String[] args) {

        // simple example for HasMap to display the results on key and value pair
        /*HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(111, "dhfjsk");
        map.put(3337, "dhjfg");
        map.put(3, "uhfieg");

        System.out.println(map.entrySet().size());

        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }*/

        // simple example to add the elements in HasMap

        HashMap<Integer, String> maa = new HashMap<Integer, String>();

        maa.put(7687, "Apple");
        maa.put(7688, "Ball");
        maa.put(7685, "cat");
        maa.put(7689, "Apple");

        System.out.println("Number of Elements:" +maa.entrySet().size());

        for (Map.Entry mmm: maa.entrySet()){
            System.out.println(mmm.getKey()+" "+mmm.getValue());
        }

        maa.putIfAbsent(7686, "Doll");
        System.out.println("After invoking putIfAbsent() method ");
        for (Map.Entry mmm: maa.entrySet()){
            System.out.println(mmm.getKey()+" "+mmm.getValue());
        }

        HashMap<Integer, String> mma = new HashMap<Integer, String>();

        mma.put(7690, "Cider");
        mma.putAll(maa);

        System.out.println("After invoking putAll() method ");
        for(Map.Entry as: mma.entrySet()){
            System.out.println(as.getKey()+" "+as.getValue());
        }
    }
}
