// buenos pero malos
// cristian garcia, sebastian niño, diego cruz, daniel sosa, samuel vega

package com.mycompany.buenosperomalospro; // Define el paquete al que pertenece esta clase

import java.util.Scanner; // Importa la clase Scanner para leer entradas del usuario por consola

public class main { // Declaración de la clase principal "main"

    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer entradas del usuario
        entrada entrada = new entrada(scanner); // Crea un objeto de la clase 'entrada' pasando el scanner como parámetro
        operciones operciones = new operciones(); // Crea un objeto de la clase 'operciones' para manejar cálculos
        salida salida = new salida(); // Crea un objeto de la clase 'salida' para mostrar resultados

        int opcion; // Variable para guardar la opción elegida por el usuario en el menú
        nomina nomina = null; // Declara una variable de tipo 'nomina' y la inicializa como null

        do { // Inicio del ciclo do-while para mostrar el menú de opciones
            System.out.println("\nNOMINA 2025 buenos pero malos"); // Muestra título del sistema
            System.out.println("1. Introducir datos"); // Opción 1
            System.out.println("2. Proceso de liquidación de nómina"); // Opción 2
            System.out.println("3. Imprimir liquidación"); // Opción 3
            System.out.println("4. Salir de la aplicación"); // Opción 4
            System.out.print("Elija una opción: "); // Solicita al usuario que elija una opción
            opcion = scanner.nextInt(); // Lee la opción ingresada por el usuario
            scanner.nextLine(); // Limpia el buffer de entrada (evita errores con entradas posteriores)

            switch (opcion) { // Evalúa la opción elegida por el usuario
                case 1: // Caso 1: Introducir datos
                    nomina = entrada.capturarDatosNomina(); // Llama al método para capturar datos de nómina
                    break;
                case 2: // Caso 2: Calcular la nómina
                    if (nomina != null) { // Verifica si ya se ingresaron datos
                        operciones.calcularNomina(nomina); // Llama al método para calcular la nómina
                    } else { // Si no se han ingresado datos
                        System.out.println("Favor de introducir los datos primero."); // Mensaje de advertencia
                    }
                    break;
                case 3: // Caso 3: Imprimir liquidación
                    if (nomina != null) { // Verifica si hay datos de nómina ya calculados
                        salida.mostrarResultados(nomina); // Muestra los resultados de la nómina
                    } else { // Si no hay datos suficientes
                        System.out.println("Favor de introducir los datos y calcular la nómina primero."); // Mensaje de advertencia
                    }
                    break;
                case 4: // Caso 4: Salir del programa
                    System.out.println("Saliendo del programa…"); // Mensaje de salida
                    break;
                default: // Caso por defecto si se ingresa una opción no válida
                    System.out.println("Opción inválida. Intente nuevamente."); // Mensaje de error
            }
        } while (opcion != 4); // El ciclo se repite mientras la opción sea diferente de 4 (Salir)

        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}

