package com.mycompany.arroz;

import java.util.Scanner;

public class Arroz {

    public static void main(String[] args) {

        //introducir el número de kilos
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************************");
        System.out.println("********* Arrocería el Peñazo********");
        System.out.println("*************************************");
        System.out.println();
        System.out.println("(recuerde que solamente hay paquetes de KG completos)");
        System.out.print("Introduzca la cantidad de KG que necesita:");

        //validación de los kilos correctos
        while (!scanner.hasNextInt()) {
            System.out.println("por favor introduzca una cantidad de KG en números enteros");
            scanner.next();
        }
        
        // si escaner es una letra mostrar error, si escaner es un numero pedidoKilos = scaner
  
        int pedidoKilos = scanner.nextInt();

        while (pedidoKilos <= 0 && !isNaN(pedidoKilos)) {
            System.out.println("somos una empresa seria, ¿quiere algo o ha venido a tocar las narices?");
            pedidoKilos = scanner.nextInt();
        }
        System.out.println("Ha pedido: " + pedidoKilos + " kilos de arroz");

        //declaración de variables. Sacos necesarios
       int numSacos5Kg = 0;
       int numSacos3Kg = 0;
       int numSacos1Kg = 0;
       
       //declaración del resto para calcular sacos
       int resto5 = 0;
       int resto3 = 0;
       
       
        //Cálculo del número de sacos de arroz
        // número de kilos mayor que 5
        if (pedidoKilos >= 5) {
            numSacos5Kg = pedidoKilos / 5;
            resto5 = pedidoKilos % 5;
            
            if (resto5 != 0){
               
                numSacos3Kg = resto5 / 3;
                resto3 = resto5 % 3;
           
            }
            
            numSacos1Kg = resto3;
            
        }
        
        if (pedidoKilos < 5 && pedidoKilos >=3) {
            numSacos3Kg = pedidoKilos / 3;
            resto3 = pedidoKilos % 3;
            
        } 
        //Calculo para solamente 
        numSacos1Kg = pedidoKilos-((numSacos5Kg*5) + (numSacos3Kg*3));
        

        System.out.println("Ticket de autoservicio");
        System.out.println("Por favor deposite en su carro los siguientes sacos de arroz");
        System.out.println(numSacos5Kg +" sacos de 5 kilos");
        System.out.println(numSacos3Kg +" sacos de 3 kilos");
        System.out.println(numSacos1Kg +" sacos de 1 kilo");
        System.out.println("GRACIAS POR SU VISITA. PASE POR CAJA");
        System.out.println("Le recordamos que está en un espacio vigilado por Collage");   
    }

    private static boolean isNaN(int pedidoKilos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
