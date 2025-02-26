package sistemaliga;

/**
 *
 * @author Uniminuto Tibu
 */
public class Partido {
    String equipoLocal;
    String equipoVisitante;
    int cestasLocal;
    int cestasVisitantes;
    String fecha;
    boolean finalizado;
    
    public Partido(String equipoLocal, String equipoVisitante, int cestasLocal, int cestasVisitantes, String fecha){
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasLocal = cestasLocal;
        this.cestasVisitantes = cestasVisitantes;
        this.fecha = fecha;
        this.finalizado = false;
    }  
    
    public String obtenerResu(){
        return "Resultado: " + equipoLocal + " " + cestasLocal + " " + equipoVisitante + " " + cestasVisitantes;
    }
    
    public void puntosLocal(int puntos){
        this.cestasLocal += puntos;
    }
    
    public void puntosVisitantes(int puntos){
        this.cestasVisitantes += puntos;
    }
    
    public String obtenerGanador(){
        if (cestasLocal > cestasVisitantes){
            return equipoLocal;
        }
        else if (cestasLocal < cestasVisitantes){
            return equipoVisitante;
        }
        else {
            return "Empate";
        }
    }
    
    public String finalPartido(){
        this.finalizado = true;
        return "Partido finalizado, elganado es: " + obtenerGanador();
    }
    
    public boolean finalizado(){
        return finalizado;
    }
}
