package Ja111_Sprint2.Day_6;

public class _2ThisRepeat {
    int x=20;
    void fun(){
        System.out.println(this);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        _2ThisRepeat obj=new _2ThisRepeat();
        System.out.println(obj);
        obj.fun();
        System.out.println(obj.x);

    }
}
