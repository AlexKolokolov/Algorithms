package es.esy.djhans.generics;

import java.util.List;

/**
 * Created by Administrator on 27.02.2016.
 */
public class GenericTest<T> {

    public void doSomething(List<T> list) {
        System.out.println(list);
    }
}
