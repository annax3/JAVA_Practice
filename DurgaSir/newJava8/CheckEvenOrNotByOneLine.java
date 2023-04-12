import java.util.function.Predicate;

public class CheckEvenOrNotByOneLine {
    public static void main(String[] args) {
        Predicate<Integer> p=integer -> integer%2==0;
        System.out.println(p.test(4));
        System.out.println(p.test(5));
    }
}
