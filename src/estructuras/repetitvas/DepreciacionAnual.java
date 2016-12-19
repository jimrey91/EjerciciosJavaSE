/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructuras.repetitvas;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DepreciacionAnual {
    public static void main(String[] args) throws IOException {
        String bien;
        int activo;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese nombre de Bien");
        bien = lector.nextLine();
        
        System.out.println("Ingrese monto de activo");
        activo = lector.nextInt();
        
        depreciacion(bien, activo);
         
    }
    
    
    public static void depreciacion(String activo, int bien) throws IOException{
              
        for (int i = 0; i < 5; i++) {
            bien = bien - 2400;
            
            System.out.println("Depreciacion de "+ activo+ " " +"en el año"+ " " + i);
            System.out.println(bien);
            System.in.read();
        }

    }
}
