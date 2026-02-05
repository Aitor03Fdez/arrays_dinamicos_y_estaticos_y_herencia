package ejercicio5;

public class Microondas implements Programable {
    boolean funcionando;
    int tiempoRestante;

    @Override
    public void iniciarPrograma(int minutos) {
        System.out.println("Iniciando Programa, minutos: " + minutos);
    }
    @Override
    public void detenerPrograma() {
        System.out.println("Programa finalizado");
    }

    @Override
    public boolean enFuncionamiento() {
        return false;
    }
}
