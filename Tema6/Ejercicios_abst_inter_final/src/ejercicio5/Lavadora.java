package ejercicio5;

public class Lavadora implements Programable{
    boolean funcionando;
    int tiempoRestante;

    @Override
    public void iniciarPrograma(int minutos) {
        System.out.print("Iniciando programa, tiempo restante: " + minutos + " minutos" );
    }

    @Override
    public void detenerPrograma() {
        boolean funcionando = false;
        int tiempoRestante = 0;
        System.out.println("Programa finalizado");
    }

    @Override
    public boolean enFuncionamiento() {
        return false;
    }
}
