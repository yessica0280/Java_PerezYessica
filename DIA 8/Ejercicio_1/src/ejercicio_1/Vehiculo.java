package ejercicio_1;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarDetalles(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
