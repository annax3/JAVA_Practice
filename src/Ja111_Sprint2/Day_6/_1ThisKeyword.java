package Ja111_Sprint2.Day_6;

public class _1ThisKeyword {
    //this point to the current object
    //static is related to a class not to any object
    int x=10;
    void fun(){
        int x=1000;
        System.out.println(this);//this point to the current object
        System.out.println("hey"+this.x);//10 object variable
        System.out.println(x);//1000 local variable
    }

    public static void main(String[] args) {
        int x=100;
        _1ThisKeyword object=new _1ThisKeyword();
        System.out.println(object);
        object.fun();
        System.out.println(object.x);
        System.out.println(x);
        //you can not refer to this keyword from the static area
        //System.out.println(this.x);

    }

}
