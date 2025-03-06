package Ejercicio4.EJ4;

/**
 *
 * @author Usuario
 */
public class ProcesadorDeOrdenes {
    public void procesar(Orden orden) {
		if (orden.Isvalid() && new Repositorio().grabar(orden)) {
			NotificadorPorEmail.getInstance().enviarMensajeDeConfirmacion(orden);
		}
	}
}
