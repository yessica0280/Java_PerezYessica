package ejercicio_2;

/**
 *
 * @author Usuario
 */
public class EmpleadoFijo extends Empleado {
    
    public EmpleadoFijo(String nombre, double salario){
        super(nombre, salario);
    }
    
    @Override
    public double CalcularBoni(){
        return getSalario() * 0.20;
    }
}
