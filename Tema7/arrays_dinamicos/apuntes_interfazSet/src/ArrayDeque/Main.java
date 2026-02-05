package ArrayDeque;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> objList1 = new ArrayDeque<String>();

        objList1.addFirst("1");
        objList1.addLast("2");
        objList1.addFirst("3");
        objList1.addLast("4");
        objList1.add("B");

        System.out.println(objList1);

        //obtener elementos
        System.out.println(objList1.removeFirst());
        System.out.println(objList1.removeLast());

        //eliminar elementos
        System.out.println(objList1.peekFirst());
        System.out.println(objList1.peekLast());

        System.out.println(objList1);

        //push metes pop sacas
        objList1.push("A");
        objList1.push("C");


    }
}
