package string_program;

public class ImmutableString {

    public static void main(String[] args) {

       //   Concat() method
        String s = "Sachin";
        s = s.concat("Tendulkar");
        System.out.println(s);

       //   equals() method & equalsIgnorecase() method
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = "sachin tendulkar";
        String s4 = "SACHIN TENDULKAR";
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));
        System.out.println(s4.equalsIgnoreCase(s3));

        //compare by == operator
        String s5 = "London";
        String s6 = "London";
        String s7 = "LONDON";
        System.out.println(s5 == s6);
        System.out.println(s6 == s7);

        //compare by compareTo () method
        String s8 = "Welcome";
        String s9 = "Thank you";
        String s10 ="Welcome";
        System.out.println(s10.compareTo(s8));  // equal
        System.out.println(s9.compareTo(s10));  // s9<s10
        System.out.println(s10.compareTo(s9));  //  s10<s9

        // String toUpperCase() & toLowerCase() methods
        String s11 = "welcome";
        String s12 = "WelCOME";
        String s13 = "WELCOME TO LONDON";
        System.out.println(s13.toLowerCase());
        System.out.println(s12.toLowerCase());
        System.out.println(s11.toUpperCase());


        // trim() method in string
        String ss = "                Hello World                   ";
        System.out.println(ss.trim());


        //String startsWith() and endsWith() method
        String str = "Sutton";
        System.out.println(str.startsWith("Su"));
        System.out.println(str.endsWith("n"));

       //String charAt() method
        String stt = "Hounslow";
        System.out.println(stt.charAt(4));
    }
}
