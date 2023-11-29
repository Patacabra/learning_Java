/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.max3;

/**
 *
 * @author fernando
 */
public class Max3 {
    
    //Un método que tome tres enteros como argumentos y devuelva el mayor de ellos.
    
        public static void main(String[] args) {
        
        int numero1 = 8;
        int numero2 = 9;
        int numero3 = 9;

        int resultado = mayor(numero1, numero2, numero3);
        System.out.println("El mayor de los tres números es: " + resultado);
    }

    public static int mayor(int a, int b, int c) {
        
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}

