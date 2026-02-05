package ejerc1;

public class Ordenador implements Encendible {
    @Override
    public void  encender(){
        System.out.println("Ordenador encender");
    }
    public void apagar(){
        System.out.println("Ordenador apagar");
    }
}
