/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4.EJ4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class NotificadorPorEmail implements NotificacionConfirmacion {
    @Override
    public void enviarMensajeDeConfirmacion(Orden orden) {

    }
    private static NotificadorPorEmail instance;

    private NotificadorPorEmail() {
    }

    public static NotificadorPorEmail getInstance() {
            if (instance == null) {
                instance = new NotificadorPorEmail();
            }
            return instance;
    }

    public List<Orden> ordenes = new ArrayList<Orden>();
        
        
}
