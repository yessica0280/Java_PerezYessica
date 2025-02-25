package java_t2_perezandrea;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Java_T2_PerezAndrea {
    public static void main(String[] args) {
        ArrayList<String> producto = new ArrayList<String>();
        Scanner productos = new Scanner(System.in);
        producto.add("Zapatos");
        producto.add("Bota");
        producto.add("Sandalias");
        while (true){
            System.out.println("Bienvenidos a mi tienda de calzado.");
            System.out.println("Por favor elija la opción que desea: ");
            System.out.println("1: Añadir.");
            System.out.println("2: Eliminar.");
            System.out.println("3: Actualizar.");
            System.out.println("4: Ver.");
            System.out.println("5: Salir.");
            int opcion = productos.nextInt();
            
            if (opcion == 1){
                // Añadir.
                System.out.println("Por favor ingresa el nombre del producto que deseas añadir a tu lista: ");
                productos.nextLine();
                String Producto = productos.nextLine();
                producto.add(Producto);
            }
            else if (opcion == 2){
                 // Eliminar.
                System.out.println("Por favor ingrese el nombre del producto que desea eliminar: ");
                productos.nextLine();
                String eliminar = productos.nextLine();
                if (producto.contains(eliminar)){
                    producto.remove(eliminar);
                }
            }
            else if (opcion == 3){
                // Actualizar.
                System.out.println("Por favor ingrese el índice que desea actualizar (0, 1, 2, 3): ");
                int actualizar = productos.nextInt();
                productos.nextLine();
                if (actualizar >= 0 && actualizar < producto.size()){
                    System.out.println("Por favor agrega el nuevo nombre: ");
                    productos.nextLine();
                    String nuevoProducto = productos.nextLine();
                    producto.set(actualizar, nuevoProducto);
                    System.out.println("El producto fue actualizado con exito.");
                }
            }
            else if (opcion == 4){
                for( int i = 0; i < producto.size(); i ++){
                    System.out.println(producto.get(i));
                }
            }
            else if(opcion == 5){
                System.out.println("Gracias por visitar nuestra tienda.");
                break;
            }

        }
    }   
}

