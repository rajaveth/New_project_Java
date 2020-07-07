package runtimePolymorphism;

public class Example1 extends Example{

    public void display(){

        System.out.println("Display message");
    }

    public static void main(String[] args) {

            Example ex = new Example1();
            ex.display();

    }
}
