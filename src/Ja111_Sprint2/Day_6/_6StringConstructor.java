package Ja111_Sprint2.Day_6;

public class _6StringConstructor {
    public static void main(String[] args) {
        // Two methods of concatenation
        String s1="Prashant";
        String s2="Anand";
        System.out.println(s1+s2);//1
        System.out.println(s1.concat(s2));//2
        int len = s1.length();
        char c = s1.charAt(2);
        System.out.println(len);
        System.out.println(c);
        System.out.println(s1.substring(1,3));//print from 1 to index 3, 3 is excluded;
        System.out.println(s1.indexOf('n'));
        System.out.println(s1.lastIndexOf('t'));
        // == operator compares the memory address of two strings/object
        // equals() method : compares the content and not the address.
        String x="Xyz";
        String y="xyz";
        String z= "Diff";
        System.out.println(x.equals(y));//true
        System.out.println(x==y);//true
        System.out.println(x.equals(z));
        System.out.println("       asd fgh        ".trim());
        System.out.println("       asd fgh        ".replace('f','F'));
       // z. for see prebuilt method
        //String are immutable(constant/unchanged)

    }
}
