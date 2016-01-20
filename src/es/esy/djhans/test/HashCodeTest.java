package es.esy.djhans.test;

/**
 * Created by Administrator on 18.12.2015.
 */
public class HashCodeTest {
    public static void main(String[] args) {
        String str1 = new String("aaa");
        System.out.println(str1.hashCode());
        String str2 = new String("aaa");
        System.out.println(str2.hashCode());
        String str3 = str2;
        System.out.println(str3.hashCode());
    }
}
