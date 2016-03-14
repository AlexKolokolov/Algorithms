package es.esy.djhans.collections;

import es.esy.djhans.SysGears.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 08.12.2015.
 */
public class ArrayListTest {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("мама");
//        list.add("мыла");
//        list.add("раму");
//
//        list.add(1, "именно");
//        list.add(3, "именно");
//        list.set(4, "именно");
//
//        System.out.println(list);
//
//        List list2 = new ArrayList();
//        list2.add("qqq");
//        list2.add(123);
//        list2.add(new Point(2,5));
//
//        String str = (String) list2.get(0);
//        System.out.println(str);
//
//        for (Object o : list2) {
//            System.out.println(o);
//        }

        List<? extends Number> list3 = new ArrayList<>();

        Integer n = 12;
        //list3.add(n); Doesn't work

    }
}
