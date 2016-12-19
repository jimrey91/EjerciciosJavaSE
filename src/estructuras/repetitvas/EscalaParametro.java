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
public class EscalaParametro {
    public static void main(String[] args) {
        String fin = JOptionPane.showInputDialog("Digite el limite");
        
        int inicio = 1;
        do{
            System.out.println(inicio);
            inicio++;
        }while(inicio <=Integer.parseInt(fin));
    }
}
