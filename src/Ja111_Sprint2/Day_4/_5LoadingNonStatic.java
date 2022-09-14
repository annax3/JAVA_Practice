package Ja111_Sprint2.Day_4;

public class _5LoadingNonStatic {
    int nonStaticInt=90;
    static int staticInt=100;
    public static void main(String[] args) {
        System.out.println(staticInt);
        //System.out.println(nonStaticInt); error

        //how to load nonStaticInt into the memory?
        //Create an Object
        _5LoadingNonStatic object= new _5LoadingNonStatic();
        System.out.println(object.nonStaticInt);
        //There are two separate Areas : 1:static 2:nonStatic;


    }

}
