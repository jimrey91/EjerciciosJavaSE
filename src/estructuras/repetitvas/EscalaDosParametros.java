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
public class EscalaDosParametros {
    public static void main(String[] args) {
        String inicio = JOptionPane.showInputDialog("Digite el inicio");
        String fin = JOptionPane.showInputDialog("Digite el fin");
        dosParametros(Integer.parseInt(inicio), Integer.parseInt(fin));
        
    }
    public static void dosParametros(int inicio, int fin){
        while(inicio <= fin){
            System.out.println(inicio);
            inicio+=2;
        }
    }
}
