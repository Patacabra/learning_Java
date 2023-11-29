/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.debu;

/**
 *
 * @author fernando
 */
public class Debu {

    public static int contarVocales(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();
        for (char c : texto.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
        
    }
    
    public static void main (String [] args){
        contarVocales("trigonometria");
    }
}   
