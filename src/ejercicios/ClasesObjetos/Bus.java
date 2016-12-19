/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.ClasesObjetos;

/**
 *
 * @author Reyes
 */
public class Bus {
    String matricula;
    int numAsientos;
    
    public void numerobuses(int buses){
        System.out.println("Numero de buses: " + buses);
    }
    
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.matricula = "05123534";
        bus.numAsientos = 20;
        
        bus.numerobuses(30);
        
        System.out.println("Matricula: " + bus.matricula);
        System.out.println("Numero de Asientos: " + bus.numAsientos);
    }
    
}
