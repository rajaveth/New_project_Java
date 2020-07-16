package array_program;

import java.util.Arrays;

public class ArrayEx4 {

    public static void main(String[] args) {

        int myArray[] = {10,20,30,40};
        int originalPosition = 3;
        int newPosition = 1;
        int temp = myArray[originalPosition];
        myArray[originalPosition] = myArray[newPosition];
        myArray[newPosition] = temp;
        System.out.println(Arrays.toString(myArray));
    }
}
