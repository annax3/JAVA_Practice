package JAVA_111.Day_10.PreClass;

public class _4AccessSpecifiers {
    /*
    * 1. Private: The access level of a private modifier is only within the class.
                      It cannot be accessed from outside the class.


     4. Public: The access level of a public modifier is everywhere. It can be accessed from within the class,
                 outside the class, within the package and outside the package.


      2. Default: The access level of a default modifier is only within the package.
                  It cannot be accessed from outside the package. Aka package-protected
                  If you do not specify any access level, it will be the default.


      3. Protected: The access level of a protected modifier is within the package and outside the package
              through child class. If you do not make the child class, it cannot be accessed from outside
               the package.


     */
    public static void main(String[] args) {
        classWithPrivateVar obj = new classWithPrivateVar();
        //private : available only within the class
        //public : available everywhere

        //compile time error
        //System.out.println(obj.anInt);

        //using getter method we can use the private method
        obj.getAnInt();
    }
}
class  classWithPrivateVar{
    private int anInt=10;
    public int getAnInt() { //getter method()
        anInt++;
        return anInt;
    }

    public void setAnInt(int newVal){
        this.anInt=newVal;
    }
    // i access inside the class but not outside the class
    void hello(){
        System.out.println(anInt);
    }
}
class Family{
    private  int anPro;
}