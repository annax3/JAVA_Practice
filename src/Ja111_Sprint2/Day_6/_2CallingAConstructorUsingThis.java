package Ja111_Sprint2.Day_6;

public class _2CallingAConstructorUsingThis {
    _2CallingAConstructorUsingThis(){
        //call to this() should always be the first statement in a constructor.
        this(10);//this will point to the  constructor which takes argument
        System.out.println("default const.");
    }
    _2CallingAConstructorUsingThis(int x){
        System.out.println("1 arg const.");
        System.out.println(x);
    }

    public static void main(String[] args) {
        _2CallingAConstructorUsingThis object=new _2CallingAConstructorUsingThis();//default constructor called
        //Which constructor is called if i call the object ?
        //Flow : Line 13-> 14->4->5->8->9->10->6
    }

}
