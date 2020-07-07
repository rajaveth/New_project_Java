package array_program;

public class ArrayEx3 {

    //  program to add two matrix

    public static void main(String[] args) {

        int a[][]= {
                         {21,42,66},
                         {10,17,18}
                    };
        int b[][]= {
                         {78,37,39},
                         {56,84,58}
                    };

        // creating another matrix to store the sum of two values
        int c[][]= new int[2][3];

        // iterating by using for loop
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                c[i][j]= a[i][j] + b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }

        // creating another matrix to store the multiplication of two values
        int d[][]= new int[2][3];

        // iterating by using for loop
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                c[i][j]= a[i][j] * b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
