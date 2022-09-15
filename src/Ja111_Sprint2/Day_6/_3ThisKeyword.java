package Ja111_Sprint2.Day_6;

public class _3ThisKeyword {
    int x=20;
    void fun(){
        int x=1000;
        System.out.println(this);
        //this keyword can access the instance variable of the current object
        System.out.println(this.x);//10 object's variable
        System.out.println(x);//1000 local variable
    }

    public static void main(String[] args) {
        _3ThisKeyword obj=new _3ThisKeyword();
        System.out.println(obj);
        obj.fun();
        System.out.println(obj.x);

    }
}
