//cristian garcia, diego cruz, sebastian niño, daniel sosa, samuel vega
package com.mycompany.musica; // Define el paquete al que pertenece esta clase

// Clase principal que contiene los métodos para afinar y tocar instrumentos
public class Musica2 {

    // Método que afina un instrumento individual
    public static void afinar(Instrumento i) {
        i.afinar(); // Llama al método afinar() del objeto Instrumento pasado como parámetro
    }

    // Método que afina todos los instrumentos de un arreglo
    public static void afinarTodo(Instrumento[] e) {
        for (int i = 0; i < e.length; i++) { // Recorre el arreglo de instrumentos
            afinar(e[i]); // Llama al método afinar() para cada instrumento en el arreglo
        }
    }

    // Método principal donde inicia la ejecución del programa
    public static void main(String[] args) {
        
        // Se crea un arreglo para almacenar 5 instrumentos
        Instrumento[] orquesta = new Instrumento[5];

        // Variable para gestionar índices en el arreglo
        int indice = 0;
        
        // Se inicializan diferentes instrumentos y se almacenan en el arreglo
        orquesta[indice++] = new Guitarra(); // Crea una instancia de Guitarra
        orquesta[indice++] = new Piano();    // Crea una instancia de Piano
        orquesta[indice++] = new Saxofon();  // Crea una instancia de Saxofón
        orquesta[indice++] = new Guzla();    // Crea una instancia de Guzla
        orquesta[indice++] = new Ukelele();  // Crea una instancia de Ukelele

        // Afina todos los instrumentos en el arreglo
        afinarTodo(orquesta);

        // Recorre el arreglo e invoca el método tocar() para cada instrumento
        for (Instrumento instrumento : orquesta) {
            instrumento.tocar(); // Cada instrumento "toca" su música
        }
    }
}