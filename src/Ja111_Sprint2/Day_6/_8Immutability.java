package Ja111_Sprint2.Day_6;

public class _8Immutability {
    //Strings are immutable(constant/Unchanged)

    public static void main(String[] args) {

        //By Gfg Example
        // Java Program to demonstrate why
        // Java Strings are immutable
        String s="Hey";
        System.out.println(s.concat("Key"));
        // Yes, s still refers to "Hey"
        System.out.println(s);

        //By arjun Sir
        String s1="hi";//["hi"] s1-> "hi"
        String temp=s1;//["hi"] s1-> "hi" temp-> s1->"hi" temp->"hi"
        s1=s1+s1;//["hi","hihi"] s-> "hihi" temp->"hi"
        System.out.println(s1);//s1->"hihi"
        System.out.println(temp);//temp->"hi"
        /* String password ="xyz";
        password="newPassword";
         */
        //drawback of immutability.
        //
        String longitude ="34.42343";
        String latitude ="56.234";
        String longitude1="34.42343";
        String latitude1 ="56.234";

        StringBuilder stringBuilder=new StringBuilder("mutable");
        stringBuilder.append("appended");
        System.out.println(stringBuilder);

        String string="immutable";
        string.concat("appended");
        System.out.println(string);

        //conversion from StringBuilder to string
        stringBuilder.toString();
        //conversion from String to StringBuilder
        StringBuilder builder=new StringBuilder(string);

        //StringBuffer-not much in use

        //compareTo
        System.out.println("abc".compareTo("xyz"));
        System.out.println("a".compareTo("a"));
        System.out.println("b".compareTo("a"));



    }
}
