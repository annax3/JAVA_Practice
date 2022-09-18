package Ja111_Sprint2.Day_7.ProblemSolving;

public class _2ObjectAsMethodInput {
    public static void main(String[] args) {
        Movie movie = new Movie(2,"movieName");
        objAsInput(movie);
        System.out.println(movie);
        returnObject();
        Movie movie1=returnObject();
    }
    //a method that takes an object-movie as an input
    static  void objAsInput(Movie movieCanBeAnyName){
        System.out.println(movieCanBeAnyName.getName());
        System.out.println(movieCanBeAnyName.getDuration());
    }
    static Movie returnObject(){
        return new Movie(4,"karma");
    }
}
