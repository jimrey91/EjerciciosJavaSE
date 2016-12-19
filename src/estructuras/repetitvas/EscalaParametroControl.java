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
public class EscalaParametroControl {
    public static void main(String[] args) {       
        String fin = JOptionPane.showInputDialog("Digite el fin");
        if(Integer.parseInt(fin) >100){
            JOptionPane.showMessageDialog(null, "El numero es mayor que 100");
        }else{
            int inicio = 1;
            while(inicio<=Integer.parseInt(fin)){
                System.out.println(inicio);
                inicio++;
            }
        }
    }
}
