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
public class ImportacionVehiculo {
    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("Digite la marca");
        String añoFab = JOptionPane.showInputDialog("Digite el año de fabricacion entre 2007-2011");
        String valorVeh = JOptionPane.showInputDialog("Digite el valor del vehiculo en USA");
        String montoSeguro = JOptionPane.showInputDialog("Digite el monto del seguro");
        String montoFlete = JOptionPane.showInputDialog("Digite el monto del flete");
        
        JOptionPane.showMessageDialog(null,"Marca del automovil: " + marca);
        JOptionPane.showMessageDialog(null,"valor original del automovil: " + valorVeh);
        
        ImportacionVehiculo importa = new ImportacionVehiculo();
        importa.calculoImportacion(Integer.parseInt(añoFab),Double.parseDouble(valorVeh), Double.parseDouble(montoSeguro), 
        Double.parseDouble(montoFlete));
        
    }
    
    public void calculoImportacion(int añoFab, double valorVehiculo, double seguro, double flete){      
        switch(añoFab){
            case 2008:
                double dai = (valorVehiculo - seguro - flete) * 0.50;
                double iva = dai + (dai * 0.13);
                JOptionPane.showMessageDialog(null,"El DAI y el IVA son:"+ dai+" "+ iva);
                break;
            case 2009:
                double dai2 = (valorVehiculo - seguro - flete) * 0.35;
                double iva2 = dai2 + (dai2 * 0.13);
                JOptionPane.showMessageDialog(null,"El DAI y el IVA son:"+ dai2+" "+ iva2);
                break;
            case 2010:
                double dai3 = (valorVehiculo - seguro - flete) * 0.25;
                double iva3 = dai3 + (dai3 * 0.13);
                JOptionPane.showMessageDialog(null,"El DAI y el IVA son:"+ dai3+" "+ iva3);
                break;
            case 2011:
                double dai4 = (valorVehiculo - seguro - flete) * 0.15;
                double iva4 = dai4 + (dai4 * 0.13);
                JOptionPane.showMessageDialog(null,"El DAI y el IVA son:"+ dai4+" "+ iva4);
                break;
            case 2012:
                double dai5 = (valorVehiculo - seguro - flete) * 0.10;
                double iva5 = dai5 + (dai5 * 0.13);
                JOptionPane.showMessageDialog(null,"El DAI y el IVA son:"+ dai5+" "+ iva5);
                break;
            default:
                JOptionPane.showMessageDialog(null,"No aplica el año" );
        }

    }
}
