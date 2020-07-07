package linkedHasMap_program;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMapEx3{

    public static void main(String[] args) {

        LinkedHashMap<Integer, Book> map = new LinkedHashMap<Integer, Book>();

        Book b1 = new Book(111, "Raja", "Press", "Dragon", 2220);
        Book b2 = new Book(256, "huin", "king", "asdf", 122);
        Book b3 = new Book(78, "jilk", "huinnn", "aaaa", 90);

        map.put(2, b3);
        map.put(3, b2);
        map.put(1, b1);

      //  System.out.println("Print the elements:"+map);

        for (Map.Entry<Integer, Book> entry: map.entrySet()){

            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key+"Details");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

    }
}
