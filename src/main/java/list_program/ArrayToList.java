package list_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {

        //creating array

        String array[] = {"Java", "Phyton", "Ruby", "pearl", "Javascript"};
        System.out.println("Printing the array:" + Arrays.toString(array));

        List<String> lll = new ArrayList<String>();
        for (String lang:array){
            lll.add(lang);
        }
        System.out.println("Printing the list:" +lll);

    }



}
