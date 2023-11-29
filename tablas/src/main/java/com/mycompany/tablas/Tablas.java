/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tablas;

/**
 *
 * @author fernando
 */

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tablas extends JFrame {
    public Tablas() {
        // Datos de ejemplo para la tabla
        Object[][] datos = {
            {"7", 1, "7"},
            {"7", 2, "14"},
            {"7", 3, "21"},
            {"7", 4, "28"},
            {"7", 5, "35"},
            {"7", 6, "42"},
            {"7", 7, "49"},
            {"7", 8, "56"},
            {"7", 9, "63"},
            {"7", 10, "70"}
        };

        // Nombres de las columnas
        String[] columnas = {"Número", "Multiplicado por:", "Resultado"};

        // Crear la tabla
        JTable tabla = new JTable(datos, columnas);

        // Agregar la tabla a un JScrollPane para permitir desplazamiento si hay muchos datos
        JScrollPane scrollPane = new JScrollPane(tabla);

        // Agregar el JScrollPane al JFrame
        add(scrollPane);

        // Configuración básica del JFrame
        setTitle("Ejemplo de Tabla en Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar en la pantalla
    }

    public static void main(String[] args) {
        // Crear y mostrar el JFrame
        Tablas mostrarTabla = new Tablas();
        mostrarTabla.setVisible(true);
    }
}