package Ja111_Sprint2.Day_4;

public class _8StaticVariables {
    static int x;
    int y;

    public static void main(String[] args) {
        _8StaticVariables obj1=new _8StaticVariables();
        obj1.x=10;
        obj1.y=20;

        _8StaticVariables obj2=new _8StaticVariables();
        obj2.x=50;
        obj2.y=20;

        System.out.println(obj1.x);//50 static variable are like global

        //another way to access the static variable
        _8StaticVariables.x=100;
        System.out.println(obj1.x);


        //diff b/n static vs nonstatic members
        //attribute---------static--------------non-static
        //belongs to--------class                 Object
        //How to access ?---className.x           not possible with class name
        //When are they init?--before running(at the time of class load)      at the time of object creation
        //sharing        same copy is shared       own copy
        //eg.             bank name,ifsc           accountNo,customerEmail


    }
}
