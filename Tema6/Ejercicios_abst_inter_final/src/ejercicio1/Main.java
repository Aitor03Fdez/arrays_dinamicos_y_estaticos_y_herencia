package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Encendible objLampara = new Lampara();
        Encendible objRadio = new Radio();

        objLampara.encender();
        objLampara.apagar();

        objRadio.encender();
        objRadio.apagar();

    }
}
