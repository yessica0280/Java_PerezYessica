package java_hospital;

/**
 *
 * @author Usuario
 */
public class Pabellon {
    static int contP=0;
    int pabellon;
    String tipoP;
    int capacidad;
    static int contD=0;
    int departamento;
    static int contPe=0;
    int personal;

    //Constructor compuesto
    public Pabellon(String tipo, int capacidad) {
        contP=contP+1;
        this.pabellon = contP;
        this.tipoP = tipoP;
        this.capacidad = capacidad;
        contD = contD + 1;
        this.departamento = contD;
        contPe = contPe + 1;
        this.personal = contPe;
    }
    
    //Uso de metodos
    public String getTipo() {
        return tipoP;
    }

    public void setTipo(String tipo) {
        this.tipoP = tipoP;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Pabellon" + "pabellon = " + pabellon + "tipo = " + tipoP + ", capacidad = " + capacidad + ", departamento = " + departamento + ", personal = " + personal;
    }
}
