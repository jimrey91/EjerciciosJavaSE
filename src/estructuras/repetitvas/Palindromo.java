/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructuras.repetitvas;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Palindromo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palin = lector.nextLine();
        boolean flag = true;
        
        for (int i = 0; i < palin.length(); i++) {
            if (palin.charAt(i)!= palin.charAt(palin.length()-1-i)) {
                flag = false; 
                break;
            }
        }
        /* IF/ELSE simplificado */
        System.out.println(flag == true ? "Es palindromo" : "No es palindromo");
//        if (flag == 1) {
//            System.out.println("Es palindromo");
//        }else{
//            System.out.println("No es palindromo");
//        }
        for (int i = 0; i < palin.length(); i++) {
            System.out.println(palin.charAt(i));
        }
        
        System.out.println("-------------------------------");
        
        for (int i = 0; i < palin.length(); i++) {
            System.out.println(palin.charAt(palin.length() -1-i));
        }
    }
}
