/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificadorprimo;

/**
 *
 * @author fernando
 */
public class VerificadorPrimo {

    public static boolean verificador (int a) {
        
        /*
        Si el número (a), es menor o igual que 1, no es primo.
        */
        if (a <= 1) {
            return false;
        }
        
        /*
        Bucle for que recorre todos los números desde 2 hasta la raíz cuadrada
        del número (a).
        */
        
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        
        /*
        Si un número no es primo, al menos uno de sus divisores debe ser menor o
        igual a su raíz cuadrada.
        
        En cada iteración se comprueba que el número (a) es divisible por 'i' 
        (Valor actual del bucle), utilizando el %, si el resto de la division es
        igual que 0, el número (a) es divisible por 'i', lo que indica que no es
        primo.
        */
        
        //En cualquier otro caso, es un número primo.
        return true;
    } 
    
    public static void main (String[] args){
        
        int a = 23;
        
        if (verificador(a)){
            System.out.println("El número es primo");
        }
        else{
            System.out.println("El número no es primo");
        }
    }
    
}
