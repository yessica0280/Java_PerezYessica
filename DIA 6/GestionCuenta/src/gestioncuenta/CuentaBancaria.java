package gestioncuenta;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    private double saldo;
    
    public CuentaBancaria(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void depositar(double cantidad){
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("El deposito fue realizado con exito.");
        }
        else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }
    
    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Su retiro fue realizado con exito.");
        }
        else if (cantidad > saldo){
            System.out.println("No tienes fondos suficientes.");
        }
        else {
            System.out.println("Por favor debes ingresar una cantidad positiva.");
        }
    }
    
    public double obtenersaldo(){
        return saldo;
    }
}
