package java_hospital;

/**
 *
 * @author Uniminuto Tibu
 */
public class Hospital {
    int hospital;
    int departamento;
    int personal;
    int paciente;
    int pabellon;
    
    public Hospital(int hospital, int departamento, int personal, int paciente, int pabellon){
        this.hospital = hospital;
        this.departamento = departamento;
        this.personal = personal;
        this.paciente = paciente;
        this.pabellon = pabellon;
    }

    @Override
    public String toString() {
        return "Hospital{" + "hospital=" + hospital + ", departamento=" + departamento + ", personal=" + personal + ", paciente=" + paciente + ", pabellon=" + pabellon + '}';
    }
}
