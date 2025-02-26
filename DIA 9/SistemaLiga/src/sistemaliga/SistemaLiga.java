package sistemaliga;

import java.util.Scanner;

/**
 *
 * @author Uniminuto Tibu
 */
public class SistemaLiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese los detalles para el Partido de Liga:");

        System.out.print("Equipo Local: ");
        String equipoLocal1 = scanner.nextLine();
        
        System.out.print("Equipo Visitante: ");
        String equipoVisitante1 = scanner.nextLine();

        System.out.print("Cestas del Equipo Local: ");
        int cestasLocal1 = scanner.nextInt();

        System.out.print("Cestas del Equipo Visitante: ");
        int cestasVisitante1 = scanner.nextInt();
        
        scanner.nextLine();  
        System.out.print("Fecha del partido: ");
        String fecha1 = scanner.nextLine();
        
        System.out.print("Jornada del partido: ");
        int jornada1 = scanner.nextInt();

        Partido partido1 = new PartidoLiga(equipoLocal1, equipoVisitante1, cestasLocal1, cestasVisitante1, fecha1, jornada1);

        System.out.println("Por favor ingrese los detalles para el Partido de PlayOff:");

        System.out.print("Equipo Local: ");
        String equipoLocal2 = scanner.nextLine();
        
        System.out.print("Equipo Visitante: ");
        String equipoVisitante2 = scanner.nextLine();

        System.out.print("Cestas del Equipo Local: ");
        int cestasLocal2 = scanner.nextInt();

        System.out.print("Cestas del Equipo Visitante: ");
        int cestasVisitante2 = scanner.nextInt();

        scanner.nextLine(); 
        System.out.print("Fecha del partido: ");
        String fecha2 = scanner.nextLine();
        
        System.out.print("Ronda del Playoff: ");
        String ronda2 = scanner.nextLine();

        Partido partido2 = new PartidoPlayOff(equipoLocal2, equipoVisitante2, cestasLocal2, cestasVisitante2, fecha2, ronda2);

        System.out.println("Resultados antes de finalizar el partido: ");
        System.out.println(partido1.obtenerResu());
        System.out.println(partido2.obtenerResu());

        System.out.println("Registrar puntos en los partidos: ");

        System.out.print("Por favor ingrese puntos para el equipo Local del Partido 1: ");
        int puntosLocal1 = scanner.nextInt();
        partido1.puntosLocal(puntosLocal1);

        System.out.print("Por favor ingrese puntos para el equipo Visitante del Partido 1: ");
        int puntosVisitante1 = scanner.nextInt();
        partido1.puntosVisitantes(puntosVisitante1);

        System.out.print("Por favor ingrese puntos para el equipo Local del Partido 2: ");
        int puntosLocal2 = scanner.nextInt();
        partido2.puntosLocal(puntosLocal2);

        System.out.print("Por favor ingrese puntos para el equipo Visitante del Partido 2: ");
        int puntosVisitante2 = scanner.nextInt();
        partido2.puntosVisitantes(puntosVisitante2);

        System.out.println("Resultados después de registrar puntos de los partidos: ");
        System.out.println(partido1.obtenerResu());
        System.out.println(partido2.obtenerResu());

        System.out.println("Final de los partidos: ");
        System.out.println(partido1.finalPartido());

        System.out.println(partido2.finalPartido());

        if (!partido2.finalizado()) {
            System.out.print("Por favor ingrese puntos para el equipo Local del Partido 2 para desempatar: ");
            int puntosDesempateLocal = scanner.nextInt();
            partido2.puntosLocal(puntosDesempateLocal);

            System.out.print("Por favor ingrese puntos para el equipo Visitante del Partido 2 para desempatar: ");
            int puntosDesempateVisitante = scanner.nextInt();
            partido2.puntosVisitantes(puntosDesempateVisitante);

            System.out.println(partido2.finalPartido());
        }
    }
    
}
