package gestioncuenta;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GestionCuenta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese el saldo de la cuenta: ");
        double saldo = scan.nextInt();
        
        System.out.println("Por favor ingrese la tasa de interes: ");
        double tasaInteres = scan.nextInt();
        
        CuentaAhorro c1 = new CuentaAhorro(saldo, tasaInteres);
        
        System.out.println("Saldo: " + c1.obtenersaldo());
        
        System.out.println("Ingrese el monto que desea depositar: ");
        double monto = scan.nextInt();
        c1.depositar(monto);
        System.out.println("El saldo después del deposito es de: " + c1.obtenersaldo());
        
        System.out.println("Por favor ingrese el monto a retirar: ");
        double montoR = scan.nextInt();
        c1.retirar((montoR));
        System.out.println("El saldo después del retiro es de: " + c1.obtenersaldo());
        
        c1.AplicarInteres();
        System.out.println("El saldo después de aplicar el interés es de: " + c1.obtenersaldo());
    }
    
}
