
package com.mycompany.numerofactorial;

public class NumeroFactorial {

    public static void main(String[] args) {
        
        //Declaro una variable int numero
        
        int numero = 4;
        
        //Declaro una variable de tipo long para manejar factoriales grandes
        
        long factorial = 1; 
        
        //Se verifica si numero es un número negativo.
        
        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo");
            
        //Si numero no es negativo, se ejecuta la variable else.
        
        } else {
            
            //Bucle for que comienza en uno y se repite mientras i sea menor o igual a numero.
            
            for (int i = 1; i <= numero; i++) {
                
                //En cada iteración se multiplica factorial por i y se almacena el resultado.
                
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es " + factorial);
    }
        }
}
