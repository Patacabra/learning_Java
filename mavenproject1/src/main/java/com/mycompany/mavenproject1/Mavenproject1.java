package com.mycompany.mavenproject1;

public class Mavenproject1 {

    public static void main(String[] args) {
        
        //for
        int result = 0;
        for(int i = 0; i<= 10; i++){
            result += i;
        }
        System.out.println(result);
        
        //while
        int i = 0;
        result = 0;
        while(i <= 10){
            result += i;
            i++;
        }
        System.out.println(result);
        
        //do {
        i = 0;
        result = 0;
                
        do{
            result +=i;
            i++;
        } while (i <= 10);
        
        System.out.println(result);
        
        
        //100
        result = 0;
        int ultimoValor= 0;
        
        for (i = 0 ; i <= 100 && result<=100 ; i++){
            result += i;
            ultimoValor = i;
        }
        System.out.println("Suma de los 100 primeros números: " + result);
        System.out.println("último valor sumado: " + ultimoValor);
        
        // Cosas
        int suma = 0;

        for ( i = 0; i <= 100; i++) {
            result += i;
        if (suma + i >= result) {
            break;  
            }
            suma += i;
            ultimoValor = i;
        }

        System.out.println("Suma de los primeros 100 números: " + suma);
        System.out.println("Último valor sumado: " + ultimoValor);
    }
}   