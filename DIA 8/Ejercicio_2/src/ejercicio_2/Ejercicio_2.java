package ejercicio_2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        ArrayList<Empleado> em = new ArrayList<>();
        
        em.add(new EmpleadoFijo("Yessica Pérez", 500000));
        em.add(new EmpleadoFijo("Alejanadra Machuca", 500000));
        em.add(new EmpleadoHoras("Zully Ortiz", 150000, 100));
        em.add(new EmpleadoHoras("Camilo Machuca", 130000, 80));
        
        for (Empleado em1 : em){
            System.out.println("Empleado: " + em1.getNombre());
            System.out.println("");
            System.out.println("Salario: " + em1.getSalario());
            System.out.println("Bonificación: " + em1.CalcularBoni());
        }
    }
    
}
