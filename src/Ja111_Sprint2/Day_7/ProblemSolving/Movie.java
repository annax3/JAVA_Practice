package Ja111_Sprint2.Day_7.ProblemSolving;

public class Movie {

        private int duration;
        private  String name;

        public Movie(int duration, String name) {
            this.duration = duration;
            this.name = name;
        }

        Movie(){}

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

}
