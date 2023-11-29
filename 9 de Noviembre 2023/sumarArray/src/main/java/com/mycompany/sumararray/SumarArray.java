/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumararray;

/**
 *
 * @author fernando
 */
public class SumarArray {

    public static int sumar(int [] array) {
        
        int resultado = 0;
        
        for (int i = 0; i < array.length; i++){
            
            resultado += array[i];
            
        }
        
        return resultado;
                
    }
    
    public static void main (String [] args){
        
        int lista [] = {1, 2, 2, 5, 5, 7};
        
        System.out.println(sumar(lista));
    }
}
