//cristian garcia, diego cruz, sebastian niño, daniel sosa, samuel vega

package com.mycompany.musica; // Define el paquete al que pertenece esta clase

// Clase Guitarraes heredada de la clase Instrumento
public class Guitarra extends Instrumento {

    // Método para definir cómo la guitarra toca
    public void tocar() {
        System.out.println("Guitarra.tocar()"); // Imprime un mensaje
    }
    
    // Método para devolver el tipo de instrumento
    public String tipo() {
        return "Guitarra"; // retorna Guitarra como el tipo de instrumento
    }
    
    // Método para afinar la guitarra
    public void afinar() {
      
    }
}