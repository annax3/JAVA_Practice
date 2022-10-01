package JAVA_111.Day_11.PreClass;

import com.sun.tools.javac.Main;

public class _1Interface implements Intr{
    // With the interface we achieve 100% abstraction in  Java.
    //an interface only abstract methods and constant variables (public static final)
    //from java-8 onwards an interface can contain some special kind of method, which will have body also.
    //We create an interface by use interface keyword.example
    /*
    Example :
             interface Intr{
                   int x =10; it will become public static final wether you mention it or not
                   void funX();//it will become public and abstract
             }

     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        Color c=Color.GREEN;
    }

    @Override
    public void _funX() {
        System.out.println("inside fun x of Main");
    }

    @Override
    public void _funY() {
        System.out.println("inside funY of Main");
    }
    //as we extend class inside another class, we implement an interface inside another class.

        Intr i1=new _1Interface();

    /*
         In Restaurant :
               Menu =====> It is kind of interface
     */
    enum Color{
        GREEN,YELLOW,RED;
    }

}
/*
Note :
       We can not create an interface object directly we always create object of the implemented concrete class.

 */