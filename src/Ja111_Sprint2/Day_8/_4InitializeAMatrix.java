package Ja111_Sprint2.Day_8;

public class _4InitializeAMatrix {
    public static void main(String[] args) {
        int[] a={2,3};
        int[][] m={
                {2,1,2},//Row:0
                {3,4},//Row:1
                {5}//Row:3
        };
        System.out.println(m[1][1]);
        //System.out.println(m[1][2]);//Array Out of bound
        //Syntax ForEach :
//        for(dataType item : array) {
//             ...
//        }

        for(int[] row:m){
            for (int n:row){
                System.out.print(n+" ");
            }
        }
    }
}
