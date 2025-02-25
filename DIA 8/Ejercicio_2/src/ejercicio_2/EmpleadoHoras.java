package ejercicio_2;

/**
 *
 * @author Usuario
 */
public class EmpleadoHoras extends Empleado {
    protected int HorasTrabajadas;
    
    public EmpleadoHoras(String nombre, double salario, int HorasTrabajadas){
        super(nombre, salario);
        this.HorasTrabajadas = HorasTrabajadas;
    }
    
    @Override
    public double CalcularBoni(){
        double baseBoni = getSalario() * 0.10;
        if (HorasTrabajadas > 160){
            baseBoni += getSalario() * 0.05;
        }
        return baseBoni;
    }
    
    public int getHorasTrabajadas(){
        return HorasTrabajadas;
    }
}
