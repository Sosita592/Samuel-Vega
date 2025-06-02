//cristian garcia, diego cruz, sebastian niño, daniel sosa, samuel vega
package com.mycompany.musica; // Define el paquete al que pertenece esta clase

// Clase Ukelele que extiende heredada de la clase Guitarra
public class Ukelele extends Guitarra {
    
    // Método  para definir cómo el ukelele
    public void tocar() {
        System.out.println("Ukelele.tocar()"); // Imprime mensaje
    }
    
    // Método  para definir el tipo de instrumento
    public String tipo() {
        return "Ukelele"; // retorna "Ukelele" como el tipo de instrumento
    }
}