/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea;

import java.util.ArrayList;

/**
 *
 * @author fernando
 */

// Se define una clase llamada Tarea.
    class Tarea{
        
        // Atributo privado que almacena la descripción de la tarea.
        private String description;
        
        // Constructor de la clase Tarea, que recibe la descripcion de la tarea 
        //como parámetro y le asigna el atributo description.
       
        public Tarea(String description){
            this.description = description;
        }
        
        // Método que devuelve la descripción de la tarea.
        
        public String getDescription(){
            return description;
        }
    
// Se define otra clase llamada ListaTareas.
    class ListaTareas{
        
        //Atributo privado que es un ArrayList de objetos tipo Tarea,
        //Almacena todas las tareas.
        private ArrayList<Tarea> tareas = new ArrayList<>();
        
        //Método que agrega una tarea a la lista
        public void agregarTarea(Tarea tarea){
            tareas.add(tarea);
        }
        
        //Método que elimina una tarea de la lista en el índice especificado.
        public void eliminarTarea(int indice) {
            
        // Se comprueba que el índice se encuentre en el rango que tiene la 
        //lista de tareas
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
        } 
        else {
            System.out.println("Índice no válido");
        }
        
    }
}
