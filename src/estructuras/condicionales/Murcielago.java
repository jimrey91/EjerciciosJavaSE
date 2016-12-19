
package estructuras.condicionales;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Murcielago {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String palabra = sc.nextLine();
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.charAt(i)) {
                case 'M':
                case 'm':
                    System.out.print("0\n");
                    break;
                case 'U':
                case 'u':
                    System.out.print("1\n");
                    break;
                case 'R':
                case 'r':
                    System.out.print("2\n");
                    break;
                case 'C':
                case 'c':
                    System.out.print("3\n");
                    break;
                case 'I':
                case 'i':
                    System.out.print("4\n");
                    break;
                case 'E':
                case 'e':
                    System.out.print("5\n");
                    break;
                case 'L':
                case 'l':
                    System.out.print("6\n");
                    break;
                case 'A':
                case 'a':
                    System.out.print("7\n");
                    break;
                case 'G':
                case 'g':
                    System.out.print("8\n");
                    break;
                case 'O':
                case 'o':
                    System.out.print("9\n");
                    break;
                default:
                    System.out.print(palabra.charAt(i) + "\n");
                    break;
            }
        }
    }
}

