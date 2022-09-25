package JAVA_111.Day_10.PreClass;
//IMP : difference b/w final , finally and finalize
public class _2FinalKeywordImp {
    //Final : can be applied to variable , class and method
    //variable : final
    //Ex :
          final int i=10;
          //i++ ; it's value can't be changed const


}
//final method
class A{
    void nonFinal(){

    }
    //Final
    //if the method is final it can't be overridden
    //-- final is just the opposite of overriding
    final void final_method(){

    }
}
class B extends A{
    @Override
    void nonFinal(){}
    //final can be overloaded but can't be override
    void final_method(String S){}
    //CT error
    //@override
     //void final_Method();
}
final class Shape{
    final double pi=22/7;
}
/*
class Circle extends Shape{ //final class can not be extended

}

 */
