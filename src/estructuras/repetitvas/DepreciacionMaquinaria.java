/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.repetitvas;

import javax.swing.JOptionPane;

/**
 *
 * @author Reyes
 */
public class DepreciacionMaquinaria {
    public static void main(String[] args) {
        String costoMaquinaria = JOptionPane.showInputDialog("Digite costo de la maquinaria");
        String nombreMaquinaria = JOptionPane.showInputDialog("Digite nombre de la maquinaria");
        String tiempoMaquinaria = JOptionPane.showInputDialog("Digite el tiempo de la maquinaria");
        calculoDepreciacion(Double.parseDouble(costoMaquinaria), Integer.parseInt(tiempoMaquinaria),nombreMaquinaria);
    }
    
    public static void calculoDepreciacion(double costo, int tiempo, String nombre){
        double sumaDigitos = (tiempo *(tiempo +1)) / 2;       
        
        for (int i = tiempo; i >= 1; i--) {            
            double depreciacion = (tiempo / sumaDigitos) * costo;
            tiempo = tiempo- 1;
            System.out.println("La maquinaria "+ nombre+ " su depreciacion "+depreciacion);
        }
    }
}
