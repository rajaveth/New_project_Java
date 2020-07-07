package list_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("aaaaa");
        list.add("bbbbbb");
        list.add("cccccc");
        list.add("ddddd");

        // arraylist to array
        String[] array = list.toArray(new String[list.size()]);
        System.out.println("printing array:" + Arrays.toString(array));
        System.out.println("Printing list:"+list);

    }
}
