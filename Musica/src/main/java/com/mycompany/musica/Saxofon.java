//cristian garcia, diego cruz, sebastian niño, daniel sosa, samuel vega
package com.mycompany.musica; // Define el paquete al que pertenece esta clase

// Clase Saxofon que es heredada de la clase Instrumento
public class Saxofon extends Instrumento {

    // Método para definir cómo el saxofón toca
    public void tocar() {
        System.out.println("Saxofon.tocar()"); // Imprime un mensaje
    }
    
    // Método  para devolver el tipo de instrumento
    public String tipo() {
        return "Saxofon"; // retorna Saxofon como el tipo de instrumento
    }
    
    // Método  para afinar el saxofón
    public void afinar() {
      
    }
}