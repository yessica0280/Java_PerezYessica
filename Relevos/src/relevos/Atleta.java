package relevos;

/**
 *
 * @author Usuario
 */
public class Atleta extends Thread {
    private String relevo;
    private static double tiempoT;

    public Atleta(String relevo) {
        super(relevo);
    }

    public Atleta() {
        tiempoT = 0;
    }

    public static double getTiempoT() {
        return tiempoT;
    }

    @Override
    public void run() {
        double tiempo = 0; // Iniciamos el tiempo del coredor en 0.
        synchronized (getClass()) {
            if (tiempoT == 0) { // Comprobamos si es el primer atleta el que comienza a correr.
                System.out.println("Comienza a correr " + getName());
                tiempo = (double) (Math.random() * (11 - 9) + 9); // Aquí se va a generar un número entre el 9 y 11 segundos que sera el tiempo que tarda en correr el atleta.
                tiempoT += tiempo;
            } else {
                System.out.println("Pasa el relevo y comienza a correr " + getName());
                tiempo = (double) (Math.random() * (11 - 9) + 9);
                tiempoT += tiempo;
            }
            System.out.println("El corredor: " + getName() + " ha tardado: " + tiempo);
            System.out.println("");
        }
    }
}
