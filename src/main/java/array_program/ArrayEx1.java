package array_program;

public class ArrayEx1 {

    public static void main(String[] args) {

        String [] cars = {"bmw", "benz", "volvo", "tata"};
        for (int k=0;k<cars.length; k++){
            System.out.println(cars[k]);
        }


        int number[]= new int[4];
        number[0] = 1000;
        number[1] = 2000;
        number[2] = 3000;
        number[3] = 5000;

        System.out.println(number.length);
        int j = number.length;
        System.out.println("Value of J:"+j);
        for (int i: number){
            System.out.println("Value of i:"+i);
        }

        int[][] myNumbers = { {1, 2, 3},
                              {4, 5, 6}
                            };
        for (int i = 0; i < myNumbers.length; i++) {
            for(int jj = 0; jj < myNumbers[i].length; jj++) {
                System.out.println(myNumbers[1][2]);
            }

        }

    }
}
