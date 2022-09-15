package Ja111_Sprint2.Day_6;

public class _5String {
    public static void main(String[] args) {
        //Quest : two ways to create Strings ?
        String s1="value"; //String literal
        String s2=new String("value");// string with new operator
        String x;
        String y;
        //System.out.println(s1==s2);
        //creates two literals compare their addresses, sunny
        //String literals are created on spring pool (PERMGEN)
        //String pool area specially created for strings it does not allow duplicates
        //Difference between both methods ?
        String name1="Prashant";
        String name2="Prashant";
        System.out.println(name1==name2);//print true because point to same address

        //in the heap area a new object is created
        String name3=new String("Kapil");
        String name4= new String("Kapil");
        System.out.println(name3==name4);
    }
}
