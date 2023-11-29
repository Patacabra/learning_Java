/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasetresenraya;

/**
 *
 * @author fernando
 */
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class ClaseTresenRaya {




    //Defino función tablero.
    public static char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    
    
            
    //Defino función jugador actual.
    public static char jugadorActual = 'X';
    
      // Defino función para imprimir tablero  
      public static void imprimirTablero() {
          
          
        System.out.println("3 En Raya");
        System.out.println("_________");
        System.out.println();
        System.out.println("  0 1 2");
        
        // Inicio bucle para recorrer todas las filas del tablero.
        for (int i = 0; i < 3; i++) {
            
            //Imprimo el índice de las filas.
            System.out.print(i + " ");
            
            //Inicio bucle para recorrer todas las columnas.
            for (int j = 0; j < 3; j++) {
                
                //Imprimo el contenido actual del tablero
                System.out.print(tablero[i][j]);
                //Si las columnas son menores que el índice 2
                if (j < 2) {
                    //Se imprime una barra para separar.
                    System.out.print("|");
                }
            }
            //Imprimo un salto de línea
            System.out.println();
            //Si las filas son menores que el índice 2
            if (i < 2) {
                // Se imprimen los guiones para separar ( lo del espacio es para que queden en su sitio)
                System.out.println("  -----");
            }
        }
        //Imprimo un salto de línea
        System.out.println();
        
          
    }
    
    // Método para verificar si un jugador ha ganado
      
    private static boolean verificarGanador() {
        
        // Verificar filas y columnas
        
        //Bucle para comprobar las filas
        for (int i = 0; i < 3; i++) {
            
            // La primera condición verifica si el jugador actual ha ocupado todas las posiciones en una fila específica.
            if ((tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) ||
                    
                    //La segunda condición verifica lo mismo pero para las columnas.
                    (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual)) {
                return true;
            }
        }

        // Verificar diagonales
        
        //La primera condición verifica la diagonal de izquierda a derecha.
        if ((tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) ||
                
                //La segunda condición verifica la diagonal de derecha a izquierda.
                (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual)) {
            return true;
        }

        return false;
        
        //Si alguna de estas condiciones es verdadera, el jugador ha ganado en esa fila o columna.
    }
    
    //Defino una función para realizar el movimiento de la ficha.
    
    private static void realizarMovimiento(int fila, int columna) {
        
        //Me aseguro de que valor de la fila esté dentro de los límites del tablero (0, 1 o 2) con un condicional if.
        if (fila >= 0 && fila < 3 
                //Me aseguro de que el valor de la columna esté dentro de los límites del tablero.
                && columna >= 0 && columna < 3 
                //Me aseguro de que la celda en la que el jugador intenta hacer su movimiento esté vacía.
                && tablero[fila][columna] == ' ') {
            //Si todas estas condiciones son verdaderas, significa que el movimiento es válido.
            tablero[fila][columna] = jugadorActual;
        //Si algo falla se ejecuta este else.    
        } else {
            System.out.println("Movimiento inválido. Inténtalo de nuevo.");
            
            //Se vuelve a solicitar que el jugador haga un movimiento a través de llamar a su función. (La función está justo abajo.)
            solicitarMovimiento();
        }
    }
    
    
    //Defino función para solicitar el movimiento de la ficha.
   public static void solicitarMovimiento() {
    // Uso scanner para pedirlo por el output.
    Scanner scanner = new Scanner(System.in);
    System.out.print("Jugador " + jugadorActual + 
            ", ingresa tu movimiento (fila + columna y enter.): ");

    // Verificar si la entrada es un entero para la fila
    while (!scanner.hasNextInt()) {
        System.out.println("Por favor, ingresa solo números del 0 al 2");
        scanner.next(); // consume el input no válido
    }
    
    int fila = scanner.nextInt();

    // Verificar si la entrada es un entero para la columna
    while (!scanner.hasNextInt()) {
        System.out.println("Por favor, ingresa solo números del 0 al 2");
        scanner.next(); // consume el input no válido
    }

    int columna = scanner.nextInt();

    // Llama a la función realizar movimiento con los datos ingresados.
    realizarMovimiento(fila, columna);
}
    
    public static void main(String[] args) {
        //Imprimo el tablero inicial llamando a su función.
        imprimirTablero();
        
        //Se inicia un bucle que itera a lo largo de los turnos del juego. 
        //Los turnos tienes que ser < 9 ya que hay 9 celdas en el tablero.
        for (int turno = 0; turno < 9; turno++) {
            //Para obtener el movimiento del jugador actual desde la entrada del usuario.
            solicitarMovimiento();
            //Se imprime el tablero después de cada movimiento.
            imprimirTablero();
            
            //Se verifica si el jugador actual ha ganado utilizando la función (Está más arriba.)
            if (verificarGanador()) {
                
                System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                return;
            }

            // Después de cada turno, el jugador actual se cambia al siguiente jugador. 
            //Si el jugador actual era 'X', se cambia a 'O', y viceversa.
            
            
            // Si esta condición es verdadera, significa que el jugador actual es 'X'.
            if (jugadorActual == 'X') {
                
                //Si la condición es verdadera, se asigna el valor 'O' a la variable jugadorActual.
                jugadorActual = 'O';
                } 
            //Si la condición es falsa (es decir, si jugadorActual no es 'X'), se asigna el valor 'X' a la variable jugadorActual.
            else {
                jugadorActual = 'X';
            }   
        }

        System.out.println("¡Empate! El juego ha terminado sin un ganador.");
    }
}