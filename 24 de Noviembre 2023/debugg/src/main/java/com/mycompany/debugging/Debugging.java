/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.debugging;

public class Debugging {

    // Contar las vocales de un string
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

    // Obtener la tabla de multiplicar de un numero
    public static String tablaMultiplicar(int numero) {
        String salida = "";
        for (int i = 0; i <= 10; i++) {
            salida += numero + " x " + i + " = " + (numero * i);
        }
        return salida;
    }

    // Suma los numeros del Array dado
    public static int sumarArray(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }

    // Encuentra el menor de una lista de numeros
    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];
        for (int num : numeros) {
            if (num <= menor) {
                menor = num;
            }
        }
        return menor;
    }
    
    // Calcula el factorial de un numero
    public static int calcularFactorial(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    

    public static void main(String[] args) {
        int add = contarVocales("Kjgasdb");
        System.out.println(add);
    }
}