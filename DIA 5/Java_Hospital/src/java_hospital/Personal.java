package java_hospital;

/**
 *
 * @author Usuario
 */
public class Personal {
    static int contP=0;
    int personal;
    String tipo_trabajo;
    int salario;
    static int contDer=0;
    int departamento;

    //Constructor compuesto
    public Personal(String nombre, String direccion, String tipo_trabajo, int salario) {
        // super(nombre, direccion);
        contP = contP + 1;
        this.personal = contP;
        this.tipo_trabajo = tipo_trabajo;
        this.salario = salario;
        contDer = contDer + 1;
        this.departamento = contDer;  
    }

    //Uso de metodos
    public String getTipo_trabajo() {
        return tipo_trabajo;
    }

    public void setTipo_trabajo(String tipo_trabajo) {
        this.tipo_trabajo = tipo_trabajo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Personal" + "personal = " + personal + ", tipo_trabajo = " + tipo_trabajo + ", salario = " + salario + ", departamento = " + departamento ;
    }
}
