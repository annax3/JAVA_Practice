package Ja111_Sprint2.Day_4.Day4Preclass;

public class Demo5 {
    //Defining method fun
    static int funX(){
        System.out.println("Inside funX ");
        return 10;
    }
    static  A funY(){
        System.out.println("inside funY");
        A a1=new A();
        return a1;
    }

    public static void main(String[] args) {
        System.out.println("Inside main method of Demo");

        var res = funX();
        System.out.println(res);

        A obj = funY();
        obj.funA();
    }
}
