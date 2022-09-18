package Ja111_Sprint2.Day_8;

public class _3NumberOfRowsAndColumns {
    public static void main(String[] args) {
        //int[] a=new int[5]
        int row=2;
        int column=3;
        int[][] matrix=new int[row][column];
        numOfRandC(matrix);

    }
    static void numOfRandC(int[][] matrix){
        System.out.print("numbers of rows ? ");
        System.out.println(matrix.length);
        System.out.print("columns ? ");
        System.out.println(matrix[0].length);
    }
}
