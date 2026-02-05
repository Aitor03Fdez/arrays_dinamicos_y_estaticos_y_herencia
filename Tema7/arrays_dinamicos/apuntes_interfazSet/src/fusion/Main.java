package fusion;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> objList = new HashSet<Integer>();
        objList.add(12);
        objList.add(15);
        objList.add(17);
        objList.add(18);
        objList.add(19);
        objList.add(20);
        objList.add(21);

        System.out.println(objList);

        LinkedHashSet<Integer> objList2 = new LinkedHashSet<Integer>(objList);
        objList2.add(12);
        objList2.add(15);
        objList2.add(17);
        objList2.add(18);

        System.out.println(objList2);

        TreeSet<Integer> objList3 = new TreeSet<Integer>(objList2);

        System.out.println(objList3);
    }
}
