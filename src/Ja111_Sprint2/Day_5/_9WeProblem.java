package Ja111_Sprint2.Day_5;

public class _9WeProblem {
    //create a class movie(noOfSongs,duration)
    Movie  m1=new Movie(10,100);

}
class Movie{
    int num;
    double duration;
    Movie(){
        num=0;
        duration=0.0;

    }
    Movie(int numberOfSongs,double durationOfSongs){
        num=numberOfSongs;
        duration=durationOfSongs;
    }
}
