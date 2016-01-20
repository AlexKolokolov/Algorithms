package es.esy.djhans.collections;

import com.sun.org.apache.xpath.internal.SourceTree;
import edu.princeton.cs.introcs.StdRandom;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by User on 13.09.2015.
 */
public class ResizingStack<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public boolean isEmpty()    {return N==0;   }
    public int size()           {return N;      }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(Item item) {
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }

    public Item pop() {
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length/4) resize(a.length / 2);
        return item;
    }

    public static void main(String[] args) {
        ResizingStack<Integer> stack = new ResizingStack<>();
        for (int i = 0; i < 100; i++) {
            int n = StdRandom.uniform(100);
            stack.push(n);
            System.out.printf("%02d ", n);
        }
        System.out.println("\n" + stack.size());
        while (!stack.isEmpty()) {
            System.out.printf("%02d ",stack.pop());
        }
        System.out.println("\n" + stack.size());
    }
}
