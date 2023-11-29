/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.euclides;

/**
 *
 * @author fernando
 */
public class Euclides {
    
    /*
    1· Se obtiene el resto de la división del número mayor entre el menor.
    
    2· Se reemplaza el número a (el mayor) por el número b (el menor) 
    y se reemplaza el número b, por el resto de la división.
    
    3· Si el número b llega a valer 0, el mcd sería el número a de esa operación.
    
    Creo una funcion para hacer el algoritmo de Euclides
    en el que se reciben dos variables.
    */
    
    public static int eucl(int a, int b) {
        
        /* 
        Como la única condición para obtener un resultado es que en algún
        momento el número b llegue a 0 utilizo if.
        Que en el momento en que b==0 me devuelve a.
        */
        
        if (b == 0){
            return a;
            
        }
        /*
        Si no, se sigue ejecutando la operación de el número más pequeño entre
        el resto de la división de los números a y b.
        */
        
        else{
            return eucl(b, a%b);
            
        }
    }
        
    public static void main (String [] args){
        
        /*
        Creo las variables para los números a y b.
        Y la variable para el resultado de la función, que es el MCD.
        */
        
        int numA = 98;
        int numB = 12;
        int mcd = eucl(numA, numB);
        
        System.out.println("El MCD de " + numA + " y " + numB + " es " + mcd);
                    
        }
    }
