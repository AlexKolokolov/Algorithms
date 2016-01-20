package es.esy.djhans.codewars;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Administrator on 28.11.2015.
 */
public class Groups {

    public static boolean groupCheck(String s) {
        HashMap<Character,Character> chMap = new HashMap<Character,Character>() {{
            put ('(',')');
            put ('{','}');
            put ('[',']');
        }};
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (chMap.containsKey(ch)) stack.push(chMap.get(ch));
            if (chMap.containsValue(ch) && (stack.empty() || stack.pop() != ch))
                return false;
        }
        return (stack.empty()) ? true : false;
    }


    public static void main(String[] args) {
        System.out.println(groupCheck("({})"));
        System.out.println(groupCheck("[[]()]"));
        System.out.println(groupCheck("[{()}]"));
        System.out.println(groupCheck("{(})"));
        System.out.println(groupCheck("([]"));
        System.out.println(groupCheck("[])"));
    }
}
