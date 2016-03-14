package es.esy.djhans.collections;

import es.esy.djhans.SysGears.Point;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 27.02.2016.
 */
public class HashSetTest {


    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("asd");
        set.add("bnm");
        set.add("cvb");
        System.out.println(set);
        System.out.println(new HashSet<>().add(new Point(1,1)));
        System.out.println(new HashSet<>().add(123));
        System.out.println(new HashSet<>().add("qqq"));
        Set set2 = new HashSet();
        set2.add(new Point(1,1));
        set2.add("123");
        set2.add(555);
        System.out.println(set2);


    }
}
