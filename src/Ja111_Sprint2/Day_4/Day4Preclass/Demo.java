package Ja111_Sprint2.Day_4.Day4Preclass;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Inside main method of Demo");

        Demo d1=new Demo();
        A a1 = new A();//Object of A class (Different class)

        System.out.println(a1);
        System.out.println(d1);
        a1.funA();
    }
}
