/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.repetitvas;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class CodigoMorse {

    /**
     *
     * @param daniel
     */
    public static void main(String...daniel) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String clave = sc.nextLine();
        
        for (int i = 0; i < clave.length(); i++) {
            switch (clave.charAt(i)) {
                case 'A':
                    System.out.println(".-");
                    break;
                case 'B':
                    System.out.println("-...");
                    break;
                case 'C':
                    System.out.println("-.-.");
                    break;
                case 'D':
                    System.out.println("-..");
                    break;
                case 'E':
                    System.out.println(".");
                    break;
                case 'F':
                    System.out.println("..-.");
                    break;
                case 'G':
                    System.out.println("--.");
                    break;
                case 'H':
                    System.out.println("....");
                    break;
                case 'I':
                    System.out.println("..");
                    break;
                case 'J':
                    System.out.println(".---");
                    break;
                case 'K':
                    System.out.println("-.-");
                    break;
                case 'L':
                    System.out.println(".-..");
                    break;
                case 'M':
                    System.out.println("--");
                    break;
                case 'N':
                    System.out.println("-.");
                    break;
                case 'O':
                    System.out.println("---");
                    break;
                case 'P':
                    System.out.println(".--.");
                    break;
                case 'Q':
                    System.out.println("--.-");
                    break;
                case 'R':
                    System.out.println(".-.");
                    break;
                case 'S':
                    System.out.println("...");
                    break;
                case 'T':
                    System.out.println("-");
                    break;
                case 'U':
                    System.out.println("..-");
                    break;
                case 'V':
                    System.out.println("...-");
                    break;
                case 'W':
                    System.out.println(".--");
                    break;
                case 'X':
                    System.out.println("-..-");
                    break;
                case 'Y':
                    System.out.println("-.--");
                    break;
                case 'Z':
                    System.out.println("--..");
                    break;
                case '1':
                    System.out.println(".----");
                    break;
                case '2':
                    System.out.println("..---");
                    break;
                case '3':
                    System.out.println("...--");
                    break;
                case '4':
                    System.out.println("....-");
                    break;
                case '5':
                    System.out.println(".....");
                    break;
                case '6':
                    System.out.println("-....");
                    break;
                case '7':
                    System.out.println("--...");
                    break;
                case '8':
                    System.out.println("---..");
                    break;
                case '9':
                    System.out.println("----.");
                    break;
                case '0':
                    System.out.println("-----");
                    break;
                case ' ':
                    System.out.println("-.-.");
                    break;
                default:
                    break;
            }
        }
    }
}
    
