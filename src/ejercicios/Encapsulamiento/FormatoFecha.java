/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.Encapsulamiento;

import java.util.Date;

/**
 *
 * @author Reyes
 */
public class FormatoFecha {
    public void fecha(String fecha){
        System.out.println("Fecha: " + fecha);
    }
    public void fecha(Date fecha){
        System.out.println("Fecha: "+ fecha.toString());
    }
    public static void main(String[] args) {
        FormatoFecha ff = new FormatoFecha();
        ff.fecha("03-07-2013");
        ff.fecha("03/07/2013");
    }
}
