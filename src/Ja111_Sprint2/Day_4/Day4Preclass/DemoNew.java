package Ja111_Sprint2.Day_4.Day4Preclass;

public class DemoNew {
    int x= 100;
    A a1= new A();
    public static void main(String[] args) {
        System.out.println("Inside main method of Demo");
        DemoNew d1=new DemoNew();
        System.out.println(d1.x);
        System.out.println(d1.a1);
        d1.a1.funA();
    }
}
