package es.esy.djhans.collections;

import java.util.ArrayList;

/**
 * Created by Administrator on 08.12.2015.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        list.add(1, "именно");
        list.add(3, "именно");
        list.set(4, "именно");

        System.out.println(list);
    }
}
