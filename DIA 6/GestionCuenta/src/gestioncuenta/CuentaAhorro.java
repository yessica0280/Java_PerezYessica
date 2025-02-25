package gestioncuenta;

/**
 *
 * @author Usuario
 */
public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteres;
    
    public CuentaAhorro(double saldo, double tasaInteres){
        super(saldo);
        this.tasaInteres = tasaInteres;
    }
    
    public double getTasaInteres(){
        return tasaInteres;
    }
    
    public void setTasaInteres(double tasaInteres){
        this.tasaInteres = tasaInteres;
    }
    
    public void AplicarInteres(){
        double nuevoSaldo = getSaldo() +  getSaldo() * tasaInteres / 100;
        setSaldo(nuevoSaldo);
        System.out.println("El nuevo saldo es de: " +  getSaldo());
    }
    
    public double ObtenerTasa(){
        return tasaInteres;
    }
}
