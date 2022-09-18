package Ja111_Sprint2.Day_8.Inheritence;

public class _2Overriding {
    public static void main(String[] args) {
        Father father = new Father();
        father.earn();
        you u=new you();
        u.earn();
    }
}
    class Father{
        void earn(){
            //1.
            System.out.println("Earn by run a business");
        }
    }
    class you extends Father{
    //rules for overriding:
        //1.there should be is a relationship
        //2.method names should be the same across the parent and child class
        //3.arg list of both the method should be the same;
    @Override
        void earn(){
            //1.
            System.out.println("earn by run a business");
            System.out.println("earn From sw engg. day job");
        }
    }

