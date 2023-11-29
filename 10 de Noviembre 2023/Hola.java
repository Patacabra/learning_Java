/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.curso.uno;

import java.util.ArrayList;
import java.util.Scanner;

/*Ejercicio 1: Conversor de Temperatura
Escribe un programa que convierta la temperatura de Fahrenheit a Celsius y viceversa.
Usa la fórmula C = (F - 32) * 5/9 para convertir de Fahrenheit a Celsius y F = C * 9/5 + 32
para convertir de Celsius a Fahrenheit.*/
public class Hola {

    public static void main(String[] args) {

        /*int result = 0;
        for (int i = 0; i <= 10; i += 2) {
            result += i;
            System.out.println(result);
        }
        System.out.println(result);

        int i = 0;
        result = 0;

        while (i <= 10) {
            result += i;
            i++;
        }
        System.out.println(result);

        i = 0;
        result = 0;

        do {
            result += i;
            i++;
        } while (i <= 10);
        System.out.println(result);

        result = 0;
        for (int x = 0; x <= 100; x++) {
            result += x;
        }
        System.out.println(result);
        System.out.println("El último valor sumado es: " + (result - 100));*/
        //palindromo.palindrome();
        //double result = conversor.temperatureConversor("Farenheit", 150);
        //System.out.println("El resultado de la conversión es: " + result);
        //boolean result = prime.isPrime(5);
        //System.out.println(result);
        //vowel.vowelCounter("Pera");
        /* Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el capital inicial: ");

        double initialCapital = input.nextDouble();

        interest.compoundInterest(initialCapital, 10.02, 1.00, 2.00);*/
        //int[] numbers = new int[]{ 1, 2, 3, 7, 25, 38};
        //arraySum.sumOfArrays(numbers);
        //evenOdd.isEvenOrOdd(numbers);
        //multiplication.multiplicationTable(7);
        //bread(2);
        myName("paco PEREZ martin");
    }

    /*public static void bread(int numberOfBread) {
        double regularPrice = 3.49;
        double discount = regularPrice * 0.6;
        double withDiscount = regularPrice - discount;

        System.out.println("El precio regular de cada barra de pan es " + regularPrice);
        System.out.printf("El descuento que se hace a cada barra es %.2f \n", discount);
        System.out.printf("El precio de la compra es %.2f", (withDiscount * numberOfBread));
    }*/
    public static void myName(String name) {
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();
        String[] nameCapital = name.split(" ");

        

        ArrayList nombreApellidosCapitalizado = new ArrayList();

        for (char i = 0; i < nameCapital.length; i++) {
            nombreApellidosCapitalizado.add(nameCapital[i].toUpperCase().charAt(0) + (nameCapital[i].substring(1, nameCapital[i].length()).toLowerCase()));

        }
        String resultado = String.join(" ", nombreApellidosCapitalizado);
        
        System.out.println(resultado + "\n" + nameLowerCase + "\n" + nameUpperCase );
    }
}
