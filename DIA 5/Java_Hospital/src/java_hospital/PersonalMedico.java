package java_hospital;

/**
 *
 * @author Usuario
 */
public class PersonalMedico {
    static int contd = 0;
    int doctor;
    String cargo;
    String equipo;
    String lider;
    
    public PersonalMedico(int doctor, String cargo, String equipo, String lider){
        contd = contd + 1;
        this.doctor = contd;
        this.cargo = cargo;
        this.equipo = equipo;
        this.lider = lider;
    }

    @Override
    public String toString() {
        return "PersonalMedico{" + "doctor=" + doctor + ", cargo=" + cargo + ", equipo=" + equipo + ", lider=" + lider + '}';
    }
}

