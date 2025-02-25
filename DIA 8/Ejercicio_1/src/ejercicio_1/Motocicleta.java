package ejercicio_1;

/**
 *
 * @author Usuario
 */
public class Motocicleta extends Vehiculo {
    protected String tipoManubrio;
    
    public Motocicleta(String marca, String modelo, String tipoManubrio){
        super(marca,modelo);
        this.tipoManubrio = tipoManubrio;
    }
    
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("El tipo de manubrio es de: " + tipoManubrio);
    }
}
