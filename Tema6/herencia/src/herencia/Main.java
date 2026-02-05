package herencia;

public class Main {
    public static void main(String[] args) {
    Animal objAnimal =  new Animal("Nico", "Blanco");
    objAnimal.hacerSonido();

    Perro objPerro = new Perro("Nico", "Blanco","Yorksire");
    objPerro.mostrarInfo();
    }
}
