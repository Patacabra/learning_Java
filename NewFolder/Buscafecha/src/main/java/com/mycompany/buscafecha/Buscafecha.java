/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscafecha;
import java.util.Scanner;
/**
 *
 * @author fernando
 */
public class Buscafecha {
    
    public static boolean esFechaValida(int dia, int mes, int anio) {
        return (dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (anio <= 9999);
        
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la fecha al usuario
        System.out.print("Ingrese la fecha en formato dd/mm/aaaa: ");
        String fechaStr = scanner.nextLine();

        // Dividir la fecha en día, mes y año
        String[] partesFecha = fechaStr.split("/");
        
        // Verificar si hay tres partes (día, mes, año)
        if (partesFecha.length == 3) {
            try {
                // Convertir las partes a números
                int dia = Integer.parseInt(partesFecha[0]);
                int mes = Integer.parseInt(partesFecha[1]);
                int anio = Integer.parseInt(partesFecha[2]);

                // Validar la fecha
                if (esFechaValida(dia, mes, anio)) {
                    // Imprimir la fecha desglosada
                    System.out.println("Día: " + dia);
                    System.out.println("Mes: " + mes);
                    System.out.println("Año: " + anio);
                } else {
                    System.out.println("La fecha ingresada no es válida.");
                }
                
                // NumberFormatException es una excepción que se lanza cuando se
                //intenta convertir una cadena que no tiene el formato correcto para un número. 
                
            } catch (NumberFormatException e) {
                System.out.println("Formato de fecha incorrecto. Ingrese números para día, mes y año.");
            }
        } else {
            System.out.println("Formato de fecha incorrecto. Ingrese la fecha en formato dd/mm/aaaa.");
        }

        scanner.close();
    }

    // Método para validar la fecha
    
}
