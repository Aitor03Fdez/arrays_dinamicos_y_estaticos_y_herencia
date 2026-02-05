package ejercicio4;

public class main {
    public static void main(String[] args) {
        Logger objLogger = new Logger();
        objLogger.log("Inicio del sistema");
        objLogger.log("Conexión inestable", 2);
        objLogger.log("Error crítico", 3);
        objLogger.log("cerrando aplicacion", true);
    }
}
