package program;

public class E implements C,D {

    public void run(){

        System.out.println("I use to walk around 5 miles per day");
    }

    public static void main(String[] args) {

        E e = new E();
        e.run();
    }
}
