/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Reyes
 */
public class RentaImponible {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Digite nombre del empleado");
        String noNit = JOptionPane.showInputDialog("Digite Nit del empleado");
        String salario = JOptionPane.showInputDialog("Digite el salario devengado");
        JOptionPane.showMessageDialog(null,"Nombre del empleado: "+nombre);
        JOptionPane.showMessageDialog(null,"Numero de Nit: "+ noNit);
        JOptionPane.showMessageDialog(null,"Salario devengado: "+ salario);
        
        RentaImponible renta = new RentaImponible();
        renta.calculoRenta(Double.parseDouble(salario));
        
    }
    
    public void calculoRenta(double salario){
        double afp = salario * (6.25/100);
        double rimp = salario - afp;
        if(rimp <= 2514.28){
            JOptionPane.showMessageDialog(null, "Exento de impuesto");
        }else if(rimp <= 9142.86){
            double rimpt = 0.10 * (rimp - 2514.29) + 57.14;
            JOptionPane.showMessageDialog(null,"La renta imponible es de: " +rimpt);
        }else if(rimp <= 22857.14){
            double rimpt = 0.20 * (rimp - 9142.87) + 720.00;
            JOptionPane.showMessageDialog(null, "La renta imponible es de: " + rimpt);
        }else if(rimp >= 22857.15){
            double rimpt = 0.30 *(rimp - 22857.15) + 3482.86;
            JOptionPane.showMessageDialog(null, "La renta imponible es de: " + rimpt);
        }
    }
}
