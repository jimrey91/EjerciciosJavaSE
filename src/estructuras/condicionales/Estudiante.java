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
public class Estudiante {
    public static void main(String[] args) {
        String carnet = JOptionPane.showInputDialog("Ingrese el numero de carnet del estudiante");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        
        String notaLab1 = JOptionPane.showInputDialog("Ingrese nota del lab 1");
        String notaLab2 = JOptionPane.showInputDialog("Ingrese nota del lab 2");
        String notaLab3 = JOptionPane.showInputDialog("Ingrese nota del lab 3");
        String notaLab4 = JOptionPane.showInputDialog("Ingrese nota del lab 4");
        
        String notaPar1 = JOptionPane.showInputDialog("Ingrese nota del parcial 1");
        String notaPar2 = JOptionPane.showInputDialog("Ingrese nota del parcial 2");
        String notaPar3 = JOptionPane.showInputDialog("Ingrese nota del parcial 3");
        String notaPar4 = JOptionPane.showInputDialog("Ingrese nota del parcial 4");
        
        promedioEstudiante(Double.parseDouble(notaLab1), Double.parseDouble(notaLab2),Double.parseDouble(notaLab3), 
         Double.parseDouble(notaLab4), Double.parseDouble(notaPar1),Double.parseDouble(notaPar2), Double.parseDouble(notaPar3), Double.parseDouble(notaPar4));
        JOptionPane.showMessageDialog(null, "Estudiante: "+ nombre + "Carnet: "+carnet);
    }
    public static void promedioEstudiante(double lab1, double lab2, double lab3, double lab4, double par1, double par2, double par3, double par4){
        double promedioLab = (lab1 + lab2 + lab3 + lab4) * 0.10;
        double promedioPar = (par1 + par2 + par3 + par4) * 0.15;
        double promedioFinal = promedioLab + promedioPar;
        
        if(promedioFinal >= 6.0){
        JOptionPane.showMessageDialog(null, "Estudiante Aprobado: " + promedioFinal);
        }else{
            JOptionPane.showMessageDialog(null, "Estudiante Reprobado: " + promedioFinal);
        }
    }
    
}
