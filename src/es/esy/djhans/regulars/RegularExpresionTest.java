package es.esy.djhans.regulars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 21.11.2015.
 */
public class RegularExpresionTest {

    public static boolean isValid(String idn) {
        // here's your code...
        Pattern pattern = Pattern.compile("^[a-zA-Z_$][a-zA-Z0-9_]*");
//        Pattern pattern = Pattern.compile("^BACON$");
        Matcher matcher = pattern.matcher(idn);
        if (matcher.matches()) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("a"));
        System.out.println(isValid("aa"));
        System.out.println(isValid("a_a"));
        System.out.println(isValid("a9"));
        System.out.println(isValid("a_9"));
        System.out.println(isValid("_a"));
        System.out.println(isValid("_9"));
        System.out.println();
        System.out.println(isValid("1"));
        System.out.println(isValid("19"));
        System.out.println(isValid("1a"));
        System.out.println(isValid("!asssad"));
        System.out.println(isValid("ass sad"));
    }
}
