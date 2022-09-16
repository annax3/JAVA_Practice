package Ja111_Sprint2.Day_7.PreClass;

public class main extends _1A{//main class is considered as a child/sub class and _1A class is considered as a parent class or superClass
    int x=20;
    void funX(){
        System.out.println("Inside funX of main");
    }

    public static void main(String[] args) {
        main m1=new main();
        System.out.println(m1.x);
        m1.funX();
        System.out.println(m1.i);
        m1.funA();

    }
}
