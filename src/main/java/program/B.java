package program;

import java.sql.SQLOutput;

public class B extends A {

    public String name = "Thilaga";
    final String salary ;

    B (){

        super();
        salary = "I had lunch";
    }

    public void name(){

        System.out.println(name);
        System.out.println(super.name);
        super.run();
    }


    public static void main(String[] args) {

        B b = new B();

        b.name();
    }
}
