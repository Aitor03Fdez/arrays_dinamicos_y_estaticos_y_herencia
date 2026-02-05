package ejer5;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set1 = new HashSet<>();
        System.out.println("Introduzca la matricula ");
        String n = sc.nextLine();

        while (!n.equals("FIN")){
            set1.add(n);
            n = sc.nextLine();
            if (set1.contains(n)){
                System.out.println("[Advertencia] Matricula ya registrada");
            }
        }

        System.out.println(set1);
    }
}
