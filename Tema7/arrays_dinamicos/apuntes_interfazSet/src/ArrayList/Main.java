package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> objList = new ArrayList();
        objList.add(1);
        objList.add(2);
        objList.add(2);
        objList.add(4);

        objList.add(null);
        objList.add(null);

        ArrayList<Integer> objList2 = new ArrayList();

        objList2.add(5);
        objList2.add(6);

        objList.addAll(2, objList2);
        System.out.println(objList);




        //Recorremos array en sentido inverso

//        ListIterator<Integer> ListIter = objList.listIterator(objList.size());
//        //hasprevious() empieza desde el final del array y mira si hay uno antes y el .previous coje en el q estas
//        while (ListIter.hasPrevious()) {
//            Integer elemento =  ListIter.previous();
//            System.out.println(elemento);
//        }

//        System.out.println(objList.indexOf(2));
//        System.out.println(objList.lastIndexOf(2));


//        System.out.println(objList.get(3));
//        objList.set(3, 10);
//        System.out.println(objList);

//        for  (Integer i : objList) {
//            System.out.println(i);
//        }
//
//        for (int i = 0; i<objList.size(); i++) {
//            System.out.println(objList.get(i));
//        }
    }
}
