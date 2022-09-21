package Ja111_Sprint2.Day_9;

public class _6Upcasting {
    public static void main(String[] args) {
        Mother mother = new Mother();
        Daughter daughter = new Daughter();
        //base class variable can have subclass reference
        Mother mother1=new Daughter();//upcasting. upper class referring down class
        String s="aasfghjk";
        Object o="asdf";//upcasting
        Object o1;
        o1=new Mother();//upcasting
        //parent class object referring to child class is called upcasting
    }
}
class Mother{}
class Daughter extends Mother{}