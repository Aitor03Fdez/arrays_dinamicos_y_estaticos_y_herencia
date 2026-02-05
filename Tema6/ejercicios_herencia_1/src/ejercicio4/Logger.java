package ejercicio4;

public class Logger {
    private String mensaje;
    private int nivel;
    private boolean guardarEnFichero;

    public Logger(){}

    public Logger(String mensaje, int nivel, boolean guardarEnFichero) {
        this.mensaje = mensaje;
        this.nivel = nivel;
        this.guardarEnFichero = guardarEnFichero;
    }
    public void log(String mensaje){
        System.out.println("[LOG] " + mensaje);
    }
    public void log(String mensaje, int nivel) {
        switch(nivel){
            case 1:
                System.out.print("[INFO] ");
                System.out.println(mensaje);
                break;
            case 2:
                System.out.print("[WARNING] ");
                System.out.println(mensaje);
                break;
            case 3:
                System.out.print("[ERROR] ");
                System.out.println(mensaje);
                break;
            default:
                System.out.println("Fallo en el sistema, ese nivel no existe");
        }
    }
    public void log(String mensaje, boolean guardarEnFichero) {
        if (guardarEnFichero) {
            System.out.println("Guardando en fichero: "+ mensaje);
        } else {
            System.out.println("Fallo en en fichero: "+ mensaje);
        }
    }
}
