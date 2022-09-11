package Ja111_Sprint2.Day_4;

public class _02DefaultValuesOfVariables {
    int x=10;//inside a class : instance Variable
    //x is non-static
    int instanceVariableWithoutAValue;
    static int z=50;
    public static void main(String[] args) {
        //this area is static
        int y=5;//inside a method :local Variable
        System.out.println(y);
        //System.out.println(x); error
        System.out.println(z);
        _02DefaultValuesOfVariables object = new _02DefaultValuesOfVariables();
        System.out.println("instanceVariableWithoutAValue : "+object.instanceVariableWithoutAValue);//Output : 0
        int localVariableWithoutAValue;//no default value
        //initialize it
        //int localVariableWithoutAValue =10;
        //System.out.println(localVariableWithoutAValue); error

    }
}
