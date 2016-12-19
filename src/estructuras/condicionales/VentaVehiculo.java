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
public class VentaVehiculo {
    public static void main(String[] args) {
        String valor =JOptionPane.showInputDialog("Digite el valor de la venta");
        String marcaVehiculo = JOptionPane.showInputDialog("Digite la marca del vehiculo");
        calculoVentaComision(Double.parseDouble(valor), marcaVehiculo.toUpperCase().charAt(0));
    }
    
    public static void calculoVentaComision(double valor, char marcaVehiculo){
        if(marcaVehiculo == 'T'){
            double comision = 0.06 * valor;
            double venta = comision * 10;
            JOptionPane.showMessageDialog(null, "La comsion y venta de Toyota es: "+ comision+" "+ venta);
        }else if (marcaVehiculo == 'K'){
            double comision = 0.05 * valor;
            double venta = comision * 10;
            JOptionPane.showMessageDialog(null, "La comsion y venta de Kia es: "+ comision+" "+ venta);
        }else if (marcaVehiculo == 'M'){
            double comision = 0.07 * valor;
            double venta = comision * 10;
            JOptionPane.showMessageDialog(null, "La comsion y venta de Mitsubishi es: "+ comision+" "+ venta);
        }else{
            JOptionPane.showMessageDialog(null, "La marca es invalida...");
        }
    }
}
