package JAVA_111.Day_10.PreClass;

public class _5Abstraction {
    //inheritance , polymorphism(types : static , Dynamic) , encapsulation - Javabean pojo
    //abstract : summary :Hide the details
    //Abstraction : it is a way of hiding the implementation details and showing only functionality to the user.
    public static void main(String[] args) {

        new Email().send(null,null,null,null);
        MathematicalShape shape=new Circle();
        shape.calculateArea();
        new Square().calculateArea();
    }
}
class Email{
    void send(String sender,String receiver ,String subject,String body){
        //smtp port ,google service , yahoo service  ?? don't know
    }

}
//hide details because :
//1. the req aren't crystal clear
//2.Flexibility / Scalability(increasing with time)

//abstract classes , ethod = without details
//concrete class, methods = with all the details
abstract class MathematicalShape{
    final double pi=22/7;
    abstract double calculateArea();
    void readme(){
        System.out.println("readme : this is the shape class ....");
    }
    /*{
        //rect : l*w;
        //circle : pi*r*r
        return 0;
    }

     */
}
class Circle extends MathematicalShape{
    int r;
    @Override
    double calculateArea(){
        return pi*r*r;
    }
}
class Square extends MathematicalShape{
    int r;
    @Override
    double calculateArea(){
        return r*r;
    }
}
//abstract class can provide abstraction from 0%(all concrete) to 100% (All abstract)