/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.random;
import java.util.Random;
import java.util.Scanner;

public class Random {

    public static void main(String[] args) {
        jugarJuego();
    }

    public static void jugarJuego() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int limiteInferior = 0;
        int limiteSuperior = 1000;
        int intento;
        char respuesta;

        System.out.println("Piensa en un número entre 0 y 1000.");

        do {
            intento = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;

            System.out.println("¿Es " + intento + " tu número? (responde 'y' si es el número, '-' si es menor, '+' si es mayor): ");
            respuesta = scanner.next().charAt(0);

            if (respuesta == '+') {
                limiteInferior = intento + 1;
            } 
            else if (respuesta == '-') {
                limiteSuperior = intento - 1;
            }

        } while (respuesta != 'y');

        System.out.println("¡Acerté! El número en el que estabas pensando es " + intento + ".");

        scanner.close();
    }
}
        
     
    
