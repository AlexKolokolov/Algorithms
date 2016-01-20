package es.esy.djhans.codewars;

/**
 * Created by Administrator on 08.12.2015.
 */
public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if (s.length() != part1.length() + part2.length()) return false;
//        if (s.length() == 0 && part1.length() == 0 && part2.length() == 0) return true;
//        for (int i = 0; i < s.length(); i++) {
//            if (part1.indexOf(s.charAt(i)) != 0 && part2.indexOf(s.charAt(i)) != 0) return false;
//            int j = 0;
//            while (j < part1.length() && part1.charAt(j) == s.charAt(i + j)) {
//                j++;
//            }
//            int k = 0;
//            while (k < part2.length() && part2.charAt(k) == s.charAt(i + k)) {
//                k++;
//            }
//            if (j > k) {
//                part1 = part1.substring(1);
//            } else {
//                part2 = part2.substring(1);
//            }
//
//        }
//        return true;
        if (s.isEmpty()) return true;
        return (!part1.isEmpty() && part1.charAt(0) == s.charAt(0) && isMerge(s.substring(1), part1.substring(1), part2)) ||
                (!part2.isEmpty() && part2.charAt(0) == s.charAt(0) && isMerge(s.substring(1), part1, part2.substring(1)));
    }

    public static void main(String[] args) {
        System.out.println(isMerge("codewars", "code", "wars"));
        System.out.println(isMerge("codewars", "cdwr", "oeas"));
        System.out.println(isMerge("codewars", "cod", "wars"));
        System.out.println(isMerge("", "", ""));
        System.out.println(isMerge("Can we merge it? Yes, we can!", "a mg?Ye, wn!", "Cn weere it se ca"));
        System.out.println(isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
    }
}
