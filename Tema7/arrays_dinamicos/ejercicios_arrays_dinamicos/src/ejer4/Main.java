package ejer4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set1 = new HashSet<>();
        System.out.println("Introduzca un nombre ");
        String n = sc.nextLine();

        while (!n.equals("FIN")){
            set1.add(n);
            n = sc.nextLine();
        }
        System.out.println(set1);

    }
}
