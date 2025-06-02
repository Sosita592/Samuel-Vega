//cristian garcia, diego cruz, sebastian niño, daniel sosa, samuel vega
package com.mycompany.musica; // Define el paquete al que pertenece esta clase

// Clase Piano que extiende la clase abstracta Instrumento
public class Piano extends Instrumento {
    
    // Método para definir cómo el piano toca
    public void tocar() {
        System.out.println("Piano.tocar()"); // Imprime mensaje 
    }
    
    // Método para devolver el tipo de instrumento
    public String tipo() {
        return "Piano"; // Devuelve "Piano" como el tipo de instrumento
    }
    
    // Método para afinar el piano
    public void afinar() {
       
    }
}