package array_program;

import java.util.Arrays;

public class ArrayEx2 {

    static void min(int arr[]){

        int min = arr[0];
        for(int i =0; i<arr.length; i++)
            if(min>arr[i])
                min = arr[i];
        System.out.println(min);
    }

    public static void main(String[] args) {

        /*String name[]= {"Volvo", "BMW", "MAN", "Tata"};
        System.out.println(name[2]);
        for (int i=0; i<name.length; i++){
            System.out.println(name[i]);
        }
        for (String i : name){
            System.out.println(i);
        }*/
        /*int a[]={23,56,47};
        min(a);

        int temp, size;
        int array[] = {10, 20, 25, 63, 96, 57};
        size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Smallest element of the array is:: "+array[0]);*/

        int array[]= {5,10,4,20,35,6};
        int size= array.length;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int res = array[0];
        System.out.println(res);

    }
}
