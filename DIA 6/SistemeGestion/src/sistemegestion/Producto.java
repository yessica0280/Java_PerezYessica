package sistemegestion;

/**
 *
 * @author Uniminuto Tibu
 */
public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    
    public Producto(){}
    
    public Producto(String codigo, String nombre, int cantidad, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String nombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        if (cantidad < 0){
            System.out.println("La cantidad no puede ser negativa.");
        }
        else {
            this.cantidad = cantidad;
        }
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        if (precio <= 0){
            System.out.println("El precio debe ser mayor que 0.");
        }
        else {
            this.precio = precio;
        }
    }
    
    public void CantidadStock(int cantidad){
        if (cantidad + cantidad < 0){
            System.out.println("No hay suficiente stock.");
        }
        else {
            this.cantidad = cantidad;
            System.out.println("Stock actualizado, la nueva cantidad es " + nombre + ": " + cantidad);
        }
    }
    
    public void MostrarProducto(){
        System.out.println("Producto: " + nombre + " Código: " + codigo + " Cantidad: " + cantidad + " Precio: $" + precio);
    }
}
