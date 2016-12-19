/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ClasesObjetos;

/**
 *
 * @author Reyes
 */
public class CalculoFrecuencia {
    double inductancia;
    double resistencia;
    double capacitancia;
    double frecuencia;
    
    public double obtenerFrecuencia(double i, double r, double c){
        double calculo = (1/c - Math.pow(2, c)/4*Math.pow(c, 2));
        frecuencia = Math.sqrt(calculo);
        return frecuencia;
    }
    public void valoresformula(double valorI, double valorR, double valorC){
        System.out.println("El valor de la inductancia es: " + valorI);
        System.out.println("El valor de la resistencia es: " + valorR);
        System.out.println("El valor de la capacitancia es: " + valorC);
    }
    
    public static void main(String[] args) {
        CalculoFrecuencia calfre = new CalculoFrecuencia();
        
        calfre.inductancia = 20;
        calfre.resistencia = 10;
        calfre.capacitancia = 0.1;
        
        calfre.obtenerFrecuencia(calfre.inductancia, calfre.resistencia, calfre.capacitancia);
        System.out.println("El valor de la frecuencia es: " + calfre.frecuencia);        
        calfre.valoresformula(calfre.inductancia,calfre.resistencia ,calfre.capacitancia );

    }
}
