// buenos pero malos
// cristian garcia, sebastian niño, diego cruz, daniel sosa, samuel vega

package com.mycompany.buenosperomalospro; // Define el paquete de la clase

public class salida { // Declaración de la clase 'salida'

    // Método para mostrar los resultados de la nómina, tomando como parámetro un objeto de tipo 'nomina'
    public void mostrarResultados(nomina nomina) {
        // Imprime el encabezado de la liquidación de la nómina
        System.out.println("\n— Liquidación de Nómina —");
        
        // Muestra el nombre del empleado
        System.out.println("Nombre: " + nomina.getNombre());
        
        // Muestra la cédula del empleado
        System.out.println("Cédula: " + nomina.getCedula());
        
        // Muestra el sueldo mensual formateado a dos decimales
        System.out.printf("Sueldo mensual: %.2f%n", nomina.getSueldoMensual());
        
        // Muestra el total devengado formateado a dos decimales
        System.out.printf("Total devengado: %.2f%n", nomina.getTotalDevengado());
        
        // Muestra el total de deducciones formateado a dos decimales
        System.out.printf("Total deducciones: %.2f%n", nomina.getTotalDeducido());
        
        // Muestra el neto a pagar formateado a dos decimales
        System.out.printf("Neto a pagar: %.2f%n", nomina.getNeto());

        // Muestra las horas extras dominicales diurnas y nocturnas con su respectivo valor
        System.out.printf("%-30s %.2f%n", "Horas extras dominicales diurnas:", nomina.getHorasExtrasDominicalesDiurnas());
        System.out.printf("%-30s %.2f%n", "Horas extras dominicales nocturnas:", nomina.getHorasExtrasDominicalesNocturnas());

        // Calcula la tarifa por hora (sueldo mensual dividido por 240 horas)
        double tarifaHora = nomina.getSueldoMensual() / 240;

        // Calcula el valor de las horas extras dominicales diurnas multiplicando por la tarifa hora y el factor 2.0
        double valorDiurnas = nomina.getHorasExtrasDominicalesDiurnas() * tarifaHora * 2.0;

        // Calcula el valor de las horas extras dominicales nocturnas multiplicando por la tarifa hora y el factor 2.5
        double valorNocturnas = nomina.getHorasExtrasDominicalesNocturnas() * tarifaHora * 2.5;

        // Muestra el valor en dinero de las horas extras dominicales diurnas con el formato adecuado
        System.out.printf("%-30s %.2f%n", "Valor en $ diurnas:", valorDiurnas);
        
        // Muestra el valor en dinero de las horas extras dominicales nocturnas con el formato adecuado
        System.out.printf("%-30s %.2f%n", "Valor en $ nocturnas:", valorNocturnas);
    }
}
