public class sb2 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("Anand");
        StringBuffer sb2=new StringBuffer("Anand");

        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));

        String s1=new String("Amma");
        String s2=new String("Amma");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}
