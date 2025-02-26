package sistemaliga;

/**
 *
 * @author Uniminuto Tibu
 */
public class PartidoLiga extends Partido {
    int jornada;
    
    public PartidoLiga(String equipoLocal, String equipoVisitante, int cestasLocal, int cestasVisitantes, String fecha, int jornada){
        super(equipoLocal, equipoVisitante, cestasLocal, cestasVisitantes, fecha);
        this.jornada = jornada;
    }
    
    @Override
    public String obtenerResu(){
        return "Resultado: " + equipoLocal + " " + cestasLocal + "  " + equipoVisitante + " " + cestasVisitantes;
    }
    
    @Override
    public String finalPartido(){
        this.finalizado = true;
        return "Partido finalizado, el ganador es: " + obtenerGanador();
    }
}
