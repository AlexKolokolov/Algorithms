package es.esy.djhans.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 07.12.2015.
 */
public class CaesarTwo {
    public static List<String> encodeStr(String s, int shift) {
        String first = s.substring(0,1).toLowerCase();
        String[] strArr = s.split("");
        String str = "";
        for (int j = 0; j < s.length(); j++) {
            str += rotate(strArr[j],shift);
        }
        str = first + rotate(first,shift) + str;
        int n = str.length();
        int div = n % 5 == 0? n / 5 : n / 5 + 1;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i += div) {
            if (div + i < n) list.add(str.substring(0 + i, div + i));
            else list.add(str.substring(0 + i));
        }
        return list;
    }

    public static String decode(List<String> s) {
        int shift = s.get(0).charAt(1) - s.get(0).charAt(0);
        if (shift < 0) shift += 26;
        s.set(0,s.get(0).substring(2));
        String res = "";
        for (int i = 0; i < s.size(); i++) {
            String[] strArr = s.get(i).split("");
            String str = "";
            for (int j = 0; j < strArr.length; j++) {
                str += reverseRotate(strArr[j],shift);
            }
            res += str;
        }
        return res;
    }

    private static String rotate(String ch, int n) {
        int cp = ch.codePointAt(0);
        if (ch.matches("[a-zA-Z]"))
            if ((cp <= 122 && cp + n > 122) || (cp <= 90 && cp + n > 90))
               ch = String.valueOf(Character.toChars(cp - 26 + n));
            else ch = String.valueOf(Character.toChars(cp + n));
        return ch;
    }

    private static String reverseRotate(String ch, int n) {
        int cp = ch.codePointAt(0);
        if (ch.matches("[a-zA-Z]"))
            if ((cp >= 97 && cp - n < 97) || (cp >= 65 && cp - n < 65))
                ch = String.valueOf(Character.toChars(cp + 26 - n));
            else ch = String.valueOf(Character.toChars(cp - n));
        return ch;
    }



    public static void main(String[] args) {
        String s = "I should have known that you would have a perfect answer for me!!!";
        List<String> list = encodeStr(s,1);
        System.out.println(list);
        System.out.println(decode(list));


    }
}
