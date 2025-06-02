//cristian garcia, diego cruz, sebastian niño, daniel sosa, samuel vega
package com.mycompany.musica; // Define el paquete al que pertenece esta clase

import java.util.*; // Importa todas las clases del paquete

// Clase abstracta Instrumento
abstract class Instrumento {
    
    // Método abstracto 'tocar', que hereden de Instrumento
    public abstract void tocar();
    
    // Método concreto 'tipo', que devuelve una cadena con el texto "Instrumento"
    public String tipo() {
        return "Instrumento"; // retorna instrumento
    }
    
    // Método abstracto 'afinar',
    public abstract void afinar();
}