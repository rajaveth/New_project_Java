package map_program;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapEx1 {

    // Java Map Example: Non-Generic (Old Style)

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(1, "Raja");
        map.put(1, "hjihihi");
        map.put(3, "Aadherai");
        map.put(4, "ram");

        // traversing the map by using set
        Set set = map.entrySet();

        Iterator itr = set.iterator();
        while(itr.hasNext()){

           // System.out.println(itr);

            Map.Entry entry= (Map.Entry)itr.next();  // converting to Map.Entry so that we can get key & value seperately

            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
