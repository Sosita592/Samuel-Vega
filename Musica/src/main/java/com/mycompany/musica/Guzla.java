//cristian garcia, diego cruz, sebastian niño, daniel sosa, samuel vega
package com.mycompany.musica; // Define el paquete al que pertenece esta clase

// Clase Guzla heredada de la clase Guitarra
class Guzla extends Guitarra {
    
    // Método sobrescrito para definir cómo la Guzla "toca"
    public void tocar() {
        System.out.println("Guzla.tocar()"); // Imprime un mensaje
    }
    
    // Método sobrescritopara definir cómo la Guzla se afina
    public void afinar() {
        System.out.println("Guzla.afinar()"); // Imprime un mensaje 
    }
}