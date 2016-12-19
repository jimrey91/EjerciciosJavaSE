
package estructuras.repetitvas;

import javax.swing.JOptionPane;

/**
 *
 * @author Reyes
 */
public class BilletesYMonedas {
    double dinero, b20, b10, b5, b1;
    double m25, m10, m5, m1;
    
    
    public static void main(String[] args) {
        String llamada = JOptionPane.showInputDialog("Ingrese duracion de llamada (en minutos)");
        calculoLlamada(Integer.parseInt(llamada));
        for (int i = 0; i < 5; i++) {
            i = i + 1;
            System.out.println(i);
        }
    }
    
    public static void calculoLlamada(int duracionLlamada){
        double moneda_1, moneda_5, moneda_10, moneda_25 ;
        int billete_1, billete_5, billete_10, billete_20;
        
        double costoNormal = 0.20;
        double costoLlamada = 0;
        for (int i = duracionLlamada; i > 3; i--) {
            
            costoLlamada = (costoNormal + 0.05) * duracionLlamada;
            
        }
        
        System.out.println("El costo total es: " + "$"+ costoLlamada);
  //      System.out.println(costoLlamada);
  
    //Cantidad de billetes
       if(costoLlamada < 5){
            billete_1 = (int) costoLlamada/1; 
            costoLlamada = (int)costoLlamada % 1 ;
            System.out.println("La cantidad de billetes de $1 es: "+billete_1+" "
                    +"El resto es: "+ costoLlamada);
        }else if(costoLlamada < 10 && 5 <= costoLlamada){
            billete_5 = (int) costoLlamada/5;
            costoLlamada = (int)costoLlamada % 5 ;
            System.out.println("La cantidad de billetes de $5 es: "+billete_5+" "
                    +"El resto es: "+ costoLlamada);
        }else if(costoLlamada < 20){
            billete_10 = (int) costoLlamada/10;
            costoLlamada = (int)costoLlamada % 10 ;
            System.out.println("La cantidad de billetes de $10 es: "+billete_10+" "
                    +"El resto es: "+ costoLlamada);
        }else if (costoLlamada >= 20){
            billete_20 = (int) costoLlamada/20;
            costoLlamada = (int)costoLlamada % 20 ;
            System.out.println("La cantidad de billetes de $20 es: "+billete_20+" "
                    +"El resto es: "+ costoLlamada);
        }else{
            System.out.println("No aplica");
        }
       //Cantidad de monedas
        if(costoLlamada < 0.05){
            moneda_1 = (int)costoLlamada/0.01;
            costoLlamada = (int)costoLlamada % 0.01;
            System.out.println("La cantidad de monedas de ¢1 es: "+moneda_1);
        }else if(costoLlamada < 0.10){
            moneda_5 = (int)costoLlamada/0.05;
            costoLlamada = (int)costoLlamada % 0.10;
            System.out.println("La cantidad de monedas de ¢5 es: "+moneda_5);
        }else if(costoLlamada < 0.20){
            moneda_10 = costoLlamada/0.10;
            System.out.println("La cantidad de monedas de ¢10 es: "+moneda_10);
        }else if(costoLlamada >= 0.25){
            moneda_25 = costoLlamada/0.25;
            System.out.println("La cantidad de monedas de ¢25 es: "+moneda_25);
        }else{
            System.out.println("No aplica");
        }
    }
}
