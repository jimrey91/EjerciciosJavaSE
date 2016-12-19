/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ClasesObjetos;



/**
 *
 * @author Reyes
 */
public class CalculoIva {
    double precioConIva;
    double precioSinIva;
      
    public double calculoIVA(double precioSinIva){
        precioConIva = precioSinIva * 1.13;
        return precioConIva;

    }
    public double calculoSinIva(double precioConIva){
        precioSinIva = precioConIva - precioConIva * 0.13;
        return precioSinIva;
    }
       

}
