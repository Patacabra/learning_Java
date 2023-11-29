/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromonumero;

/**
 *
 * @author fernando
 */
public class Palindromonumero {

    public static void main(String[] args) {
        
        //Dado un número comprobar si es palíndromo o no.
        //Variable string con el número.
        
        String num = "6996";
        
        //Variable int para el valor numérico de la longitud de la variable.
        
        int longitud = num.length();
        
        //Variable vacía para rellenar con el resultado del número escrito del revés.
        
        String delReves = "";
        
        //Bucle que itera con la variable de la última cifra del número
        //mientras i sea mayor que 0, se va restando uno a uno.
        
        for(int i = longitud -1; i >= 0; i--){
            char cifra = num.charAt(i);
            
            //Se añade esta cifra del revés a la variable vacía
            delReves += cifra;
        }
        //Comprobar si del derecho es igual que del revés
        System.out.println("¿El número es un palíndromo? " + num.equals(delReves));
    }
        
}
