package JAVA_111.Day_7;

public class _1ArrayDemo {
    public static void main(String[] args) {
        //syntax for Declaration
        //syntax : <datatype>[]<array_name>
        int [] ages;//[0,1,2...]
        //syntax for creating
        //new <DataType>[size]
        ages=new int[10];

        //another way
        String[] names=new String[10];
        Integer[] integers=new Integer[5];
        int k=0;
        for(int i=0;i<integers.length;i++){
            integers[i]=k;
            System.out.print(integers[i]+" ");
            k++;
        }
        System.out.println(ages);
        //Quest: When (not) to use array ?
        // 1.you know the number of items
        // 2.same data types


        //another way :
        String[] array={"one","two","Three"};
        System.out.println(array[1]);
        //iterating over an array :
        //for, while

        //Syntax :
        /*
        *for(<data_type> loop_variable : name_of_array){
        * sout(loop_variable)
        * }
         */
        for (String nameCanBeAnything: array){
            System.out.print(nameCanBeAnything);
        }
       //Array. : for different methods
    }
}
