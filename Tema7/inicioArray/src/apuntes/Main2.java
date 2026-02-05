package apuntes;

public class Main2 {
    String nombre;
    public Main2(String nombre) {
        this.nombre = nombre;
    }
    public static void main(String[] args) {
        //array de objetos
        Main2 array[] = {new Main2 ("Juan"), new Main2 ("Daniel")};

        Main2 arrayClonado[] = array.clone();
        arrayClonado[0].nombre = "Antonio";
        System.out.println(array[0].nombre);
        System.out.println(arrayClonado[0].nombre);

    }
}
