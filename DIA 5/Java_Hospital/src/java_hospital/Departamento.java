package java_hospital;

/**
 *
 * @author Uniminuto Tibu
 */
public class Departamento {
    static int cont_d = 0;
    int departamento;
    String tipo_d;
    static int contp = 0;
    int personal_id;
    
    public Departamento(String tipo_d){
        cont_d = cont_d + 1;
        this.departamento = cont_d;
        this.tipo_d = tipo_d;
        contp = contp + 1;
        this.personal_id = contp;
    }
    
    public String grtTipo(){
        return tipo_d;
    }
    
    public void setTipo(String tipo_d){
        this.tipo_d = tipo_d;
    }

    @Override
    public String toString() {
        return "Departamento{" + "departamento=" + departamento + ", tipo_d=" + tipo_d + ", personal_id=" + personal_id + '}';
    } 
}
