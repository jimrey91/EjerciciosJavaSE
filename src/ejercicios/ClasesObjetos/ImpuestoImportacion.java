/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ClasesObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Reyes
 */
public class ImpuestoImportacion {
    double precioArticulo;
    double impuesto[] = new double[5];
    
    public double calculoMonto(double precio){
        for (int i = 0; i < 5; i++) {
        impuesto[i] = precio * 0.10;
        }      
        return impuesto[5];
        }
    public static void main(String[] args) {
        ImpuestoImportacion imp = new ImpuestoImportacion();
        String monto;
        monto = JOptionPane.showInputDialog("Ingrese monto del articulo: ");
        imp.calculoMonto(Double.parseDouble(monto));
        
        JOptionPane.showMessageDialog(null, "El valor del monto es: " + imp.impuesto);
                
    }
}
