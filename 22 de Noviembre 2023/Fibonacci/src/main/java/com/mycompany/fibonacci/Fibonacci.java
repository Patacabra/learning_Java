/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

/**
 *
 * @author fernando
 */
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        // Declarar un ArrayList
        ArrayList<Integer> sucesion = new ArrayList<>();
        ArrayList<Integer> resultado = new ArrayList<>();
        
        int a = 0;
        int b = 1;
        
        long enesimo = 65;
        
        sucesion.add(a);
        sucesion.add(b);
        
        for(int i = 2; i <= enesimo; i ++){
            int c = a + b;
             a = b;
             b = c;
             resultado.add(c);

        }
    
    System.out.println(resultado.get(resultado.size() -1));
    }
       
}        