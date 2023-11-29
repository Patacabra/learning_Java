package com.mycompany.palindromo;


public class Palindromo {

    public static void main(String[] args) {
        
        //Dada una palabra comprobar si es palíndromo o no.
        
        String pal = "abba";
        int longitud = pal.length();
        
        //Del derecho. Primero imprimo letra a letra la palabra
        for (int i = 0; i< pal.length(); i++){
            char letra = pal.charAt(i);
        }
        
        // Del revés. Creo una variable String vacía para llenarla con el resultado de la palabra al revés.
        String delReves = "";
        for(int i = longitud -1; i >= 0; i--){
            char letra = pal.charAt(i);
            //Se añade esta cifra del revés a la variable vacía
            delReves += letra;
        }
        
        //Comprobar si del derecho es igual que del revés
        // .equals para comparar la variable. == para comparar las cosas en sí mismas.
        System.out.println("¿La palabra es un palíndromo? " + pal.equals(delReves));
    }   
}
