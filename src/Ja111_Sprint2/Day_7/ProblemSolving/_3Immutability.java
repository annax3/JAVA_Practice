package Ja111_Sprint2.Day_7.ProblemSolving;

public class _3Immutability {
    public static void main(String[] args) {
        int x=10;
        x++;
        System.out.println(x);
        String s="String";//[string,stringmuted]
        String s1=s.concat("muted");
        System.out.println(s);
    }
}
