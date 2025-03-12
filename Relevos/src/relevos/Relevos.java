package relevos;

/**
 *
 * @author Usuario
 */
public class Relevos {
    public static void main(String[] args) throws InterruptedException  {
        Atleta a1 = new Atleta("Pedro");
        Atleta a2 = new Atleta("Henao");
        Atleta a3 = new Atleta("Luis M");
        Atleta a4 = new Atleta("Camilo");
        
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        
        a1.join();
        a2.join();
        a3.join();
        a4.join();
    
        System.out.println("final de la carrera, timepo total: " + Atleta.getTiempoT());
    }
}
