package arrayList_Program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListEx1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("hhhhh");
        list.add("cccccc");
        list.add("aaaaa");
        list.add("aaaaa");
        list.add("ddddd");

        System.out.println(list.size());
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Vector<String> ll = new Vector<String>();
        ll.add("Three");
        ll.addElement("Four");

        System.out.println(ll);
    }
}
