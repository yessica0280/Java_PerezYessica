package sistemaliga;

/**
 *
 * @author Uniminuto Tibu
 */
public class PartidoPlayOff extends Partido{
    String ronda;
    
    public PartidoPlayOff(String equipoLocal, String equipoVisitante, int cestasLocal, int cestasVisitantes, String fecha, String ronda){
        super(equipoLocal, equipoVisitante, cestasLocal, cestasVisitantes, fecha);
        this.ronda = ronda;
    }
    
    @Override
    public String obtenerResu(){
        return "Resultado: " + equipoLocal + " " + cestasLocal + " " + equipoVisitante + " " + cestasVisitantes;
    }
    
    @Override
    public String finalPartido(){
        if (cestasLocal == cestasVisitantes){
            return "Empate, el partido debe seguir hasta que desempaten.";
        }
        this.finalizado = true;
        return "Partido finalizado el ganador es: " + obtenerGanador();
    }
}
