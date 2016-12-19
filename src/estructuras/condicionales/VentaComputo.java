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
public class VentaComputo {
    public static void main(String[] args) {
        String valorVenta = JOptionPane.showInputDialog("Digite el valor de la venta");
        
        VentaComputo venta = new VentaComputo();
        venta.calculoSalario(Double.parseDouble(valorVenta));
    }
    
    public void calculoSalario(double venta){
        if(venta >=3000){
            double comision = venta * 0.10;
            double salario = comision + 300;
            JOptionPane.showMessageDialog(null,"El salario liquido1 es: "+ salario);
            
        }else if(venta >= 1000){
            double comision = venta * 0.08;
            double salario = comision + 300;
            JOptionPane.showMessageDialog(null,"El salaio liquido2 es: "+salario);
            
        }else if((venta >= 1)){
            double comision = venta * 0.05;
            double salario = comision + 300;
            JOptionPane.showMessageDialog(null, "El salario liquido3 es:"+ salario);
        }else{
            JOptionPane.showMessageDialog(null, "El salario liquido aplica...");
        }       
    }
}
