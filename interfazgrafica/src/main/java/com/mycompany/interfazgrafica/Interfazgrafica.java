/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfazgrafica;

/**
 *
 * @author fernando
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Interfazgrafica {
    private static char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    private static char jugadorActual = 'X';

    private static JButton[][] botones = new JButton[3][3];
    private static JLabel mensajeLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tres en Raya");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);

            JPanel panel = new JPanel(new GridLayout(3, 3));
            mensajeLabel = new JLabel("Jugador " + jugadorActual + ", es tu turno.");
            mensajeLabel.setHorizontalAlignment(JLabel.CENTER);

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    botones[i][j] = new JButton(" ");
                    botones[i][j].setFont(new Font("Arial", Font.PLAIN, 24));
                    int finalI = i;
                    int finalJ = j;
                    botones[i][j].addActionListener(e -> botonPresionado(finalI, finalJ));
                    panel.add(botones[i][j]);
                }
            }

            frame.add(panel, BorderLayout.CENTER);
            frame.add(mensajeLabel, BorderLayout.SOUTH);
            frame.setVisible(true);
        });
    }

    private static void botonPresionado(int fila, int columna) {
        if (tablero[fila][columna] == ' ') {
            tablero[fila][columna] = jugadorActual;
            botones[fila][columna].setText(Character.toString(jugadorActual));

            if (verificarGanador()) {
                mensajeLabel.setText("¡Jugador " + jugadorActual + " ha ganado!");
                desactivarBotones();
            } else if (tableroCompleto()) {
                mensajeLabel.setText("¡Empate! El juego ha terminado sin un ganador.");
                desactivarBotones();
            } else {
                cambiarJugador();
                mensajeLabel.setText("Jugador " + jugadorActual + ", es tu turno.");
            }
        } else {
            mensajeLabel.setText("Casilla ocupada. Intenta de nuevo.");
        }
    }

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
    private static void solicitarMovimiento() {
        
        //Uso scanner para pedirlo por el output.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jugador " + jugadorActual + ", ingresa tu movimiento (fila y columna): ");
        
        //Se utilizan los métodos nextInt() de scanner para leer dos enteros de la entrada del jugador.
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();
        
        //Llama a la función realizar movimiento (La función está arriba) con los datos ingresados. El valor de la fila y la columna.
        realizarMovimiento(fila, columna);
    }
    
    

    private static boolean tableroCompleto() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void cambiarJugador() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
    }

    private static void desactivarBotones() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j].setEnabled(false);
            }
        }
    }
}