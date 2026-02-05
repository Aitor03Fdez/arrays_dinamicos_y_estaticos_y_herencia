package treeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * Se imprime de manera ascendente y no permite null
 */
public class Main {
    public static void main (String[] args) {
        Set<String> objTreeSet = new TreeSet<String>();

        objTreeSet.add("D");
        objTreeSet.add("A");
        objTreeSet.add("C");
        objTreeSet.add("B");

        System.out.println(objTreeSet);

        TreeSet<Integer> objTreeSet2 = new TreeSet<Integer>();

        objTreeSet2.add(2);
        objTreeSet2.add(1);
        objTreeSet2.add(3);

        //primer elemento
        System.out.println(objTreeSet2.first());

        //ultimo elemento
        System.out.println(objTreeSet2.last());

        //Devuelve el mayor elemento de la colección que sea menor o igual que el elemento
        System.out.println(objTreeSet2.floor(2));
        //Devuelve el menor elemento de la colección que sea mayor o igual que el elemento
        System.out.println(objTreeSet2.ceiling(3));
        //muestra la longitud en los dinamicos, en estaticos es lenght
        System.out.println(objTreeSet2.size());
        //borra los elementos con clear
        objTreeSet2.clear();
        System.out.println(objTreeSet2.size()); // 0
        




    }
}
