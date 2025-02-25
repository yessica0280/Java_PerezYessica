package ejercicio_1;

/**
 *
 * @author Usuario
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        Vehiculo Coche = new Coche(" Chevrolet Spart", "Go Next", 4);
        Vehiculo Moto = new Motocicleta("Yamaha", "Crypton FI", "Manubrio Crypton 115 FI");
        
        System.out.println("Detalles del coche: ");
        Coche.mostrarDetalles();
        System.out.println("");
        
        System.out.println("Detalles de la motocicleta: ");
        Moto.mostrarDetalles();
    }
    
}
