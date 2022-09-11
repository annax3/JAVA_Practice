package Ja111_Sprint2.Day_4.Day4Preclass;

public class Demo4 {
    //Defining method fun
    static void funX(A a1){
        System.out.println("Inside funX "+a1);
        a1.funA();
    }

    public static void main(String[] args) {
        System.out.println("Inside main method of Demo");
        A obj = new A();
        funX(obj);
    }
}
