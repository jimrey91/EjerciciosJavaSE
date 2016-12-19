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
public class CalculoIMC {
    public static void main(String[] args) {
        String peso = JOptionPane.showInputDialog("Ingrese el peso(Kg) de la persona");
        String altura = JOptionPane.showInputDialog("Ingrese la altura(Metros) de la persona");
        
        CalculoIMC imc = new CalculoIMC();
        imc.calcularIMC(Double.parseDouble(peso), Double.parseDouble(altura));
        
    }
    
    public void calcularIMC(double peso, double altura){
        double imc = peso / Math.pow(altura, 2);
        if(imc < 16){
            JOptionPane.showMessageDialog(null, "Criterio de ingreso en hospital: "+ Math.round(imc));
        }else if(imc <=17){
            JOptionPane.showMessageDialog(null, "Infrapeso: "+  Math.round(imc));
        }else if(imc <=18){
            JOptionPane.showMessageDialog(null, "Bajo peso: "+  Math.round(imc));
        }else if(imc <=25){
            JOptionPane.showMessageDialog(null, "Peso normal(Saludable): "+  Math.round(imc));
        }else if(imc <=30){
            JOptionPane.showMessageDialog(null, "Sobrepeso (Obesidad de grado I): "+  Math.round(imc));
        }else if(imc <=35){
            JOptionPane.showMessageDialog(null, "Sobrepeso crónico (Obesidad de grado II): "+  Math.round(imc));
        }else if(imc <=40){
            JOptionPane.showMessageDialog(null, "Obesidad premórbida (Obesidad de grado III): "+  Math.round(imc));
        }else if(imc >40){
            JOptionPane.showMessageDialog(null, "Obesidad mórbida (Obesidad de grado IV): "+  Math.round(imc));
        }else{
            JOptionPane.showMessageDialog(null, "El valor no es valido...");
        }
        
    }
}
