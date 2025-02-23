package java_hospital;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Uniminuto Tibu
 */
public class Java_Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Persona> listaPersona = new ArrayList<>();
        ArrayList<Departamento> listaDepartamento = new ArrayList<>();
        ArrayList<Personal> listaPersonal = new ArrayList<>();
        ArrayList<Pabellon> listaPabellon = new ArrayList<>();
        
        Persona personaA = new Persona("Dr. Jesus García", "Avenida 33");
        Departamento departamentoA = new Departamento("Departamento auxiliar");
        Personal personalA = new Personal("Dr. Jesus García", "Avenida 33", "Quirófano", 50000);
        Pabellon pabellonA = new Pabellon("Pediatrico", 25);
        
        listaPersona.add(personaA);
        listaDepartamento.add(departamentoA);
        listaPersonal.add(personalA);
        listaPabellon.add(pabellonA);
        
        boolean exit = false;
        while (exit == false){
            System.out.println("-- Menú Departamento --");
            System.out.println("1: Agregar departamento.");
            System.out.println("2: Ver departamentos.");
            System.out.println("3: Actualizar departamento.");
            System.out.println("4: Eliminar departamento.");
            System.out.println("5: Salir del programa.");
            System.out.println("Por favor elije una de nuestras opciones.");
            int opcion = scan.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("Por favor ingresa los datos del nuevo departamento: ");
                    System.out.println("1: Tipo departamento: ");
                    scan.nextLine();
                    String tipoD = scan.nextLine();
                    Departamento NewDepartamento = new Departamento(tipoD);
                    listaDepartamento.add(NewDepartamento);
                    System.out.println("El nuevo departamento fue añadido con exito.");
                    break;
                    
                case 2:
                    System.out.println("Estos son los departamentos del hospital: ");
                    for (int i = 0; i < listaDepartamento.size(); i ++){
                        System.out.println("Departamento: " + listaDepartamento.get(i).departamento);
                        System.out.println("Tipo: " + listaDepartamento.get(i).tipo_d);
                        System.out.println("Personal: " + listaDepartamento.get(i).personal_id);
                    }
                    break;
                    
                case 3:
                    System.out.println("Por favor ingresa el id del departamento que deseas actualizar: ");
                    int id_d = scan.nextInt();
                    scan.nextLine();
                    
                    boolean depa = false;
                    for (int i = 0; i < listaDepartamento.size(); i ++){
                        if (listaDepartamento.get(i).departamento == id_d){
                            System.out.println("En este caso solo podrás actualizar el campo de tipo de departamento.");
                            System.out.println("Por favor ingresa el nuevo tipo de departamento: ");
                            String tipo_d = scan.nextLine();

                            listaDepartamento.get(i).setTipo(tipo_d);
                            System.out.println("El nuevo tipo de departamento fue actualizado con exito: " + tipo_d);
                            depa = true;
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Por favor ingresa el id del departamento que deseas elimianr: ");
                    int eliminar = scan.nextInt();
                    for (int i = 0; i < listaDepartamento.size(); i ++){
                        if (listaDepartamento.get(i).departamento == eliminar){
                            listaDepartamento.remove(i);
                        }
                    }
                    System.out.println("El departamento fue eliminado corectamente.");
                    break;
                
                case 5:
                    System.out.println("Gracias por usar nuestro programa.");
                    exit = true;
                    break;
            }
        }
    }
    
}
