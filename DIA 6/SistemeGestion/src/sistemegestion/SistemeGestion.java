package sistemegestion;

/**
 *
 * @author Uniminuto Tibu
 */
public class SistemeGestion {
    public static void main(String[] args) {
        Producto p1 = new Producto("001", "Zapatos", 5, 100.000);
        Producto p2 = new Producto("002", "Sandalías", 3, 50.000);
        Producto p3 = new Producto("003", "Zapatillas", 4, 60.000);
        
        System.out.println("Inventario");
        p1.MostrarProducto();
        p2.MostrarProducto();
        p3.MostrarProducto();
        System.out.println("");
        
        p1.CantidadStock(2);
        p2.CantidadStock(1);
        p3.CantidadStock(2);
        System.out.println("");
        
        System.out.println("Inventario actualizado");
        p1.MostrarProducto();
        p2.MostrarProducto();
        p3.MostrarProducto();
    }
    
}
