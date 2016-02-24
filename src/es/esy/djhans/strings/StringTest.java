package es.esy.djhans.strings;

/**
 * Created by Administrator on 28.01.2016.
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        String s11 = "aaa";
        String s12 = "aaa";
        System.out.println(s11.equals(s12));
        System.out.println(s11==s12);
        s1 = s1.intern();
        System.out.println(s11==s1);
        System.out.println("qqq" == "qqq");
        System.out.println("www".equals("www"));
    }
}
