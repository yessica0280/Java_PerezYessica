package java_hospital;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Uniminuto Tibu
 */
public class Paciente {
    static int contPa = 1;
    int paciente;
    String fecha_nacimiento;
    LocalDate fecha_vinculacion;
    String diagnostico;
    int edad;
    static int contPab = 1;
    int pabellon;
    static int contH = 1;
    int hospital;
    static int contPer = 1;
    int persona;

    //Constructor compuesto
    public Paciente(String fecha_nacimiento, String diagnostico) {
        contPa = contPa + 1;
        this.paciente = contPa;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_vinculacion = LocalDate.now();
        this.diagnostico = diagnostico;
        
        LocalDate fecha = LocalDate.parse(fecha_nacimiento);
        
        this.edad = calcular(fecha, fecha_vinculacion);
        contPab = contPab + 1;
        this.pabellon = contPab;
        contH = contH + 1;
        this.hospital = contH;
        contPer = contPer + 1;
        this.persona = contPer;
    }
    
    public int calcular(LocalDate fecha, LocalDate fecha_vinculacion){
        Period periodo = Period.between(fecha, fecha_vinculacion);
        return periodo.getYears();
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Pacientes" + "paciente = " + paciente + ", fecha_nacimiento = " + fecha_nacimiento + ", fecha_vinvulacion = " + fecha_vinculacion + ", diagnostico = " + diagnostico + ", edad = " + edad + ", pabellon = " + pabellon + ", hospital = " + hospital + ", persona = " + persona;
    }
}
