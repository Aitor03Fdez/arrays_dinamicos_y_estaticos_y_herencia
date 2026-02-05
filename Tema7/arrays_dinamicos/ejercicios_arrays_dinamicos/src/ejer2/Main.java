package ejer2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();

        for (Integer i : set) {
            if (i % 2 != 0) {
                set2.add(i);
            }
        }

        set2.removeLast();
        System.out.println(set2);


    }
}
