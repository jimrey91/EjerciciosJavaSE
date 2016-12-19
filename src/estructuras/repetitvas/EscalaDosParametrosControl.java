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
public class EscalaDosParametrosControl {
    public static void main(String[] args) {
        String inicio = JOptionPane.showInputDialog("Digite el inicio");
        String fin = JOptionPane.showInputDialog("Digite el fin");
        if (Integer.parseInt(inicio)<0){
            JOptionPane.showMessageDialog(null, "El valor de inicio es menor que cero");
        }else if(Integer.parseInt(fin)>50){
            JOptionPane.showMessageDialog(null, "El valor final es mayor que 50");
        }else{
            dosParametrosControl(Integer.parseInt(inicio), Integer.parseInt(fin));
        }        
    }
    
    public static void dosParametrosControl(int inicio, int fin){
        do{
            System.out.println(inicio);
            inicio++;
        }while(inicio <= fin);
    }
}
