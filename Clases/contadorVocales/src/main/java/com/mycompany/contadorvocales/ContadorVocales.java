/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadorvocales;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class ContadorVocales {

    public static void main(String[] args) {
        ArrayList<String> vocales = new ArrayList<String>();
        ArrayList<String> vocalespalabra = new ArrayList<String>();
        ArrayList<String> consonantespalabra = new ArrayList<String>();

        // Agregar vocales a la lista de vocales
        
        vocales.add("a");
        vocales.add("e");
        vocales.add("i");
        vocales.add("o");
        vocales.add("u");
        vocales.add("á");
        vocales.add("é");
        vocales.add("í");
        vocales.add("ó");
        vocales.add("ú");
        
        // Creo un Scanner para leer la entrada del usuario.
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Palabra o frase: ");
        
        // Convierte la palabra o frase a minúsculas.
        
        String palabra = scanner.nextLine().toLowerCase(); 
        
        // Bucle for que recorre cada carácter de la palabra.
        
        for (int i = 0; i < palabra.length(); i++) {
            
            // Variable letra para obtener el carácter en la posición i.
            
            String letra = String.valueOf(palabra.charAt(i));
            
            // Se verifica si la letra es una vocal. 
            
            if (vocales.contains(letra)) {
                
                // Añade la vocal a la lista de vocalespalabra.
                
                vocalespalabra.add(letra);
                
              // Si no es una vocal, Y ES UNA LETRA se agrega a la lista
              
            } else if (Character.isLetter(letra.charAt(0))) { 
                
                //
                consonantespalabra.add(letra);
            }
        }

        System.out.println("Vocales en la palabra: " + vocalespalabra.size() + " (" + vocalespalabra + ")");
        System.out.println("Consonantes en la palabra: " + consonantespalabra.size() + " (" + consonantespalabra + ")");
    }
}
