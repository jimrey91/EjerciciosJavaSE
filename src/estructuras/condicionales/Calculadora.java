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
public class Calculadora {
    public static void main(String[] args) {
        String operacion = JOptionPane.showInputDialog("Ingrese la operacion a realizar: Suma=S, Resta=R, Multiplicacion=M, Division=D");
        String valor1 = JOptionPane.showInputDialog("Ingrese el primer valor");
        String valor2 = JOptionPane.showInputDialog("Ingrese el segundo valor");
        calculadoraSwitch(operacion.toUpperCase().charAt(0),Integer.parseInt(valor1),Integer.parseInt(valor2));            
    }
    
    public static void calculadoraSwitch(char operacion, int valor1, int valor2){       
        
        switch(operacion){
            case'S':
                int suma = valor1 + valor2;
                JOptionPane.showMessageDialog(null, "La suma es: "+ suma);
                break;
            case'R':
                int resta = valor1 - valor2;
                JOptionPane.showMessageDialog(null, "La resta es: "+ resta);
                break;
            case'M':
                int multi = valor1 * valor2;
                JOptionPane.showMessageDialog(null, "La multiplicacion es: "+ multi);
                break;
            case'D':
                int division = valor1 / valor2;
                JOptionPane.showMessageDialog(null, "La division es: "+ division);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operacion invalida...");
        }
    }
}
