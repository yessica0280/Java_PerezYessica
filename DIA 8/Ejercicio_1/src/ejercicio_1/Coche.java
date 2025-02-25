package ejercicio_1;

/**
 *
 * @author Usuario
 */
public class Coche extends Vehiculo {
    protected int numeroPuertas;
    
    public Coche(String marca, String modelo, int numeroPuertas){
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("El número de puertas es de: " + numeroPuertas);
    }
}
