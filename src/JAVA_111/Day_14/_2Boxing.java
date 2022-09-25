package JAVA_111.Day_14;

public class _2Boxing {
    public static void main(String[] args) {
        //autoboxing, unboxing
        int x=10;
        //prim to Wrapper
        Integer wrapperInt =Integer.valueOf(x);
        //same as
        Integer autoBoxedInt=x;//autoboxing

        //unboxing
        //wrapper to prim
        int primInt=wrapperInt.intValue();

    }
}
