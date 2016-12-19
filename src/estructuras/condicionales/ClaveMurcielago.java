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
public class ClaveMurcielago {
    private final char[] clave = {'M', 'U', 'R', 'C', 'I', 'E', 'L', 'A', 'G', 'O'};

    private char[] transcribirPalabra(char[] palabra) {
        //instanciar arreglo resultante
        char[] result = new char[palabra.length];
        //recorrer el arreglo de la palabra original
        for (int i = 0; i < palabra.length; i++) {
        //obtener la letra a intercambiar y agregarla al nuevo arreglo
        result[i] = buscarLetraClave(palabra[i]);
        }
        return result;
    }

    private char buscarLetraClave(char letra) {
        //recorrer el arreglo de la palabra murcielago
        for (int i = 0; i < clave.length; i++) {
        //si la letra buscada se encuentra dentro de la palabra murcielago
        if (clave[i] == letra || Character.toUpperCase(letra) == clave[i]) {
        //retornar como char la posición numérica de la letra en la palabra murcielado
        return Integer.toString(i).charAt(0);
        }
        }
        //si no se encuentra la letra buscada en el arreglo murcielago, se retorna la misma letra
        return letra;
    }

    private char[] pedirPalabra() {
        //pedir al usuario el ingreso de la palabra
        String str = JOptionPane.showInputDialog(null, "Ingresa una palabra:");
        //si se ingresó una palabra se retorna en arreglo char, si no, se retorna null
        return str != null ? str.toCharArray() : null;
    }

    public static void main(String[] args) {
        ClaveMurcielago c = new ClaveMurcielago();
        //pedir palabra
        char[] palabra = c.pedirPalabra();
        //si se ingreó una palabra
        if (palabra != null) {
        JOptionPane.showMessageDialog(null, String.valueOf( c.transcribirPalabra(palabra) ));
        }
        else {
        JOptionPane.showMessageDialog(null, "Error, no se ingreso una palabra");
        }
    }
}
