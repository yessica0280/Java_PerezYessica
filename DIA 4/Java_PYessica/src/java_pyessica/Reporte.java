package java_pyessica;

/**
 *
 * @author Uniminuto Tibu
 */
public class Reporte {
    int id;
    String nombre;
    String apellido;
    String estado;
    
    public Reporte(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = "Luis";
        this.apellido = "Caicedo";
        this.estado = "Aprobado";
    }
    
    public Reporte(int id, String nombre, String apellido, String estado){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reporte{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", estado=" + estado + '}';
    }
}
