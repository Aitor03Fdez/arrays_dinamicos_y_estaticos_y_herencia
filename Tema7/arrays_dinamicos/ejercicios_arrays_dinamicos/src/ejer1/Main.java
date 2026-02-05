package ejer1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        HashSet<Integer> set2 = new HashSet<Integer>();

        for  (Integer i : set) {
            if(i % 2 == 0) {
                set2.add(i);
            }
        }
        System.out.println(set2);

    }
}
