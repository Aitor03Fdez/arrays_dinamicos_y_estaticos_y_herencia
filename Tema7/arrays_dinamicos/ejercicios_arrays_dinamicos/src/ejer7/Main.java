package ejer7;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nombre ");
        String n = sc.nextLine();

        while (!n.equals("FIN")){
            set1.add(n);
            n = sc.nextLine();
        }
        System.out.println(set1);
    }
}
