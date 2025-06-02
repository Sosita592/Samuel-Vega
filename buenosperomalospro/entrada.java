//buenos pero malos//
//cristian garcia, sebastian niño, diego cruz, daniel sosa, samuel vega//

package com.mycompany.buenosperomalospro;

import java.util.Scanner;

// Clase encargada de capturar los datos ingresados por el usuario
public class entrada {

    private Scanner scanner; // Objeto Scanner para leer datos desde consola

    // Constructor que recibe el objeto Scanner para entrada de datos
    public entrada(Scanner scanner) {
        this.scanner = scanner;
    }

    // Método para capturar todos los datos necesarios para la liquidación de nómina
    public nomina capturarDatosNomina() {
        nomina nomina = new nomina(); // Se crea un nuevo objeto nomina
        scanner.nextLine(); // Limpiar buffer

        // Captura de cédula
        System.out.print("Cédula: ");
        nomina.setCedula(scanner.nextLine());

        // Captura del nombre del empleado
        System.out.print("Nombre: ");
        nomina.setNombre(scanner.nextLine());

        // Captura del sueldo mensual
        System.out.print("Sueldo mensual: ");
        nomina.setSueldoMensual(scanner.nextDouble());
        scanner.nextLine(); // Limpiar buffer

        // Captura de días trabajados
        System.out.print("Días trabajados: ");
        nomina.setDiasTrabajados(scanner.nextInt());
        scanner.nextLine(); // Limpiar buffer

        // Captura de horas extras diurnas
        System.out.print("Horas extras diurnas: ");
        nomina.sethorasExtrasDiurnas(scanner.nextDouble());
        scanner.nextLine(); // Limpiar buffer

        // Captura de horas extras nocturnas
        System.out.print("Horas extras nocturnas: ");
        nomina.sethorasExtrasNocturnas(scanner.nextDouble());
        scanner.nextLine(); // Limpiar buffer

        // Captura de horas de recargo nocturno
        System.out.print("Horas recargo nocturno: ");
        nomina.sethorasRecargoNocturno(scanner.nextDouble());
        scanner.nextLine(); // Limpiar buffer

        // Captura del nivel de riesgo ARL
        System.out.print("Nivel de ARL (1-5): ");
        nomina.setNivelArp(scanner.nextInt());
        scanner.nextLine(); // Limpiar buffer

        // Captura de horas extras dominicales diurnas
        System.out.print("Horas extras dominicales diurnas: ");
        nomina.setHorasExtrasDominicalesDiurnas(scanner.nextDouble());
        scanner.nextLine(); // Limpiar buffer

        // Captura de horas extras dominicales nocturnas
        System.out.print("Horas extras dominicales nocturnas: ");
        nomina.setHorasExtrasDominicalesNocturnas(scanner.nextDouble());
        scanner.nextLine(); // Limpiar buffer

        return nomina; // Se retorna el objeto con todos los datos capturados
    }
}