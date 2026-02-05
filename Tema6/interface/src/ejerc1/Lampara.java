package ejerc1;

public class Lampara implements Encendible {
    @Override
    public void  encender(){
        System.out.println("Lampara encender");
    }
    public void apagar(){
        System.out.println("Lampara apagar");
    }
}
