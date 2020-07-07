package map_program;

import java.util.HashMap;
import java.util.Map;

public class HasMapEx2 {

    // Java Map Example: Generic (new Style)

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(100, "Alfa");
        map.put(101, "Alfa");
        map.put(99, "raj");

        for(Map.Entry mm: map.entrySet()){

            System.out.println(mm.getKey()+" "+mm.getValue());
        }

    }
}
