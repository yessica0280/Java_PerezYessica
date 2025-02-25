package ejercicio_2;

/**
 *
 * @author Usuario
 */
public class Empleado {
    protected String nombre;
    protected double salario;
    
    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public double CalcularBoni(){
        return salario * 0.10;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getSalario(){
        return salario;
    }
}
