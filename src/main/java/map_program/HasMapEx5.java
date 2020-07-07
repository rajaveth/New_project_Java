package map_program;

import java.util.HashMap;

public class HasMapEx5 {

    public static void main(String[] args) {

        // Usage of remove () method

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Amit", 1111);
        map.put("Daisy", 6789);
        map.put("Hulk", 66666);
        map.put("Noodle", 5555);

        System.out.println("Initial number of elements:" +map);

        map.remove("Hulk");
        System.out.println("Initial number of elements:" +map);



    }
}
