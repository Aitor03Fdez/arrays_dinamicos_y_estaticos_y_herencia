package ejer8;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Double> set1 = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nombre ");
        String n = sc.nextLine();

        while (!n.equals("FIN")){
            double nueva = Double.parseDouble(n);
            set1.add(nueva);
            n = sc.nextLine();
        }

        System.out.println(set1);
    }
}
