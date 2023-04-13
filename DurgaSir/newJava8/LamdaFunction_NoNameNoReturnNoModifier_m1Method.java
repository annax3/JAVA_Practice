public class LamdaFunction_NoNameNoReturnNoModifier_m1Method {
      //()->{System.out.println("hello ji..");} curly bracket is used when multiple line are there
     // (int a,int b)->System.out.println(a+b);
    //(int n)->return n*n; we can't use return statement without curly brackets  (int n)-> n*n
    // parenthesis is not require if only one element n->n*n;



    public static void main(String[] args) {
        System.out.println(m1("Prashant"));
    }
    public static int m1(String s){
        return s.length();
    }
    //lambda expression : s-> s.length()

}
