package list_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetElement {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("hhhhh");
        list.add("cccccc");
        list.add("aaaaa");
        list.add("bbbbbb");
        list.add("ddddd");
        System.out.println("Using element by get method:" +list.get(0));

      //  list.set(2, "FFFFFFF");

        Collections.sort(list);

        for (String jin: list)
        System.out.println(jin);

        List<Integer> inte = new ArrayList<Integer>();
        inte.add(789);
        inte.add(89798);
        inte.add(62534652);
        inte.add(44445);
        inte.add(998);

        Collections.sort(inte);

        for(Integer num: inte)
            System.out.println(num);
    }
}
