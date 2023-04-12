import java.util.function.Function;

public class OneLineCodeForAboveNormalWayOfWritingTheCode {
    public static void main(String[] args) {
        //Function<what i required, what i give as output> f=i->i*i;
        Function<Integer,Integer> f=i->i*i;
        System.out.println("The square of 4 is : " +f.apply(4));
        System.out.println("The square of 5 is : " +f.apply(5));
    }
}
