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
public class EscalaInversaParametro {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Ingrese el valor");
        limiteInverso(Integer.parseInt(valor));

    }
    public static void limiteInverso(int valor){
            while(valor >= 1){
            System.out.println(valor);
            valor--;
            
        }
    }

}
