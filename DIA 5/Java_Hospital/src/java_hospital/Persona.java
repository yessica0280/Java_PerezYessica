package java_hospital;

/**
 *
 * @author Uniminuto Tibu
 */
public class Persona {
    static int contId = 0;
    int persona;
    String nombre;
    String direccion;
    static int contH = 0;
    int hospital;
    
    //Constructor compuesto
    public Persona(String nombre, String direccion) {
        contId = contId+1;
        this.persona = contId;
        this.nombre = nombre;
        this.direccion = direccion;
        contH = contH + 1;
        this.persona = contH;
    }
    
    //Uso de metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Personas" + "persona = " + persona + ", nombre = " + nombre + ", direccion = " + direccion + ", hospital = " + hospital;
    }
}
