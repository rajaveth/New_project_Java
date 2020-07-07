package string_program;

public class MutableString {

    public static void main(String[] args) {

        //  StringBuffer class methods
        //  append() method
        StringBuffer strr = new StringBuffer("Welcome to ");
        strr.append("London");
        System.out.println(strr);

        //  insert() method
        StringBuffer sss = new StringBuffer("Britain");
        sss.insert(2, "european");
        System.out.println(sss);

        // replace() method
        StringBuffer sg = new StringBuffer("Java");
        sg.replace(1,3, "world");
        System.out.println(sg);

        // delete() method
        StringBuffer sj = new StringBuffer("Hounslow");
        sj.delete(2,5);
        System.out.println(sj);

        // reverse() method
        StringBuffer sk = new StringBuffer("Hounslow");
        sk.reverse();
        System.out.println(sk);


        //StringBuilder class methods


    }
}
