package ejer10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        ArrayList<Integer> list2 = new ArrayList();

        for (int i : list) {
            if (i % 2 == 0) {
                list2.add(i);
            }

        }

        System.out.println(list2);
    }
}
