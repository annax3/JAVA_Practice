package Ja111_Sprint2.Day_7.ProblemSolving;

public class _1JavaBean {
    //Create a JavaBean Movie : Duration : Int,Name :String
    //Create objects of this bean and print the values
    public static void main(String[] args) {
        Movie movie1=new Movie(2,"RRR");
        Movie movie2=new Movie(3,"KGF");
        //2 ways to set values:
        //1. use parameterized  constructor.
        //2.Setter
        Movie movie3 = new Movie();
        movie3.setDuration(1);
        movie3.setName("Spiderman");
        System.out.println(movie1.getDuration());
        System.out.println(movie1.getName());

    }
}
