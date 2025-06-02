// buenos pero malos
// cristian garcia, sebastian niño, diego cruz, daniel sosa, samuel vega

package com.mycompany.buenosperomalospro; // Define el paquete al que pertenece la clase

public class operciones { // Declaración de la clase 'operaciones'

    // Método para calcular la nómina del empleado, tomando como parámetro un objeto de tipo 'nomina'
    public void calcularNomina(nomina nomina) { 
        // Calcula la tarifa por hora, dividiendo el sueldo mensual entre las horas estándar de trabajo (240)
        double tarifaHora = nomina.getSueldoMensual() / 240;

        // Calcula el salario diario, dividiendo el sueldo mensual entre 30 días
        double salarioDiario = nomina.getSueldoMensual() / 30;

        // Calcula las horas extras diurnas multiplicando las horas extras diurnas por la tarifa hora y el 1.25 (tarifa extra diurna)
        double extrasDiurnas = nomina.gethorasExtrasDiurnas() * tarifaHora * 1.25;

        // Calcula las horas extras nocturnas multiplicando las horas extras nocturnas por la tarifa hora y el 1.75 (tarifa extra nocturna)
        double extrasNocturnas = nomina.gethorasExtrasNocturnas() * tarifaHora * 1.75;

        // Calcula el recargo nocturno por las horas trabajadas en horario nocturno
        double recargosNocturnos = nomina.getHorasRecargoNocturno() * tarifaHora * 0.35;

        // Calcula las horas extras dominicales diurnas, multiplicando por la tarifa hora y el 2.00 (tarifa dominical diurna)
        double extrasDominicalesDiurnas = nomina.getHorasExtrasDominicalesDiurnas() * tarifaHora * 2.00;

        // Calcula las horas extras dominicales nocturnas, multiplicando por la tarifa hora y el 2.50 (tarifa dominical nocturna)
        double extrasDominicalesNocturnas = nomina.getHorasExtrasDominicalesNocturnas() * tarifaHora * 2.50;

        // Redondea los valores de las horas extras a dos decimales
        extrasDiurnas = Math.round(extrasDiurnas * 100.0) / 100.0;
        extrasNocturnas = Math.round(extrasNocturnas * 100.0) / 100.0;
        recargosNocturnos = Math.round(recargosNocturnos * 100.0) / 100.0;
        extrasDominicalesDiurnas = Math.round(extrasDominicalesDiurnas * 100.0) / 100.0;
        extrasDominicalesNocturnas = Math.round(extrasDominicalesNocturnas * 100.0) / 100.0;

        // Calcula el total devengado sumando los conceptos mencionados y redondeando a dos decimales
        double totalDevengado = Math.round((salarioDiario * nomina.getDiasTrabajados() +
                                            extrasDiurnas + extrasNocturnas + recargosNocturnos +
                                            extrasDominicalesDiurnas + extrasDominicalesNocturnas) * 100.0) / 100.0;

        // Verifica si el sueldo mensual es menor o igual a 2.600.000 y si el empleado trabajó 30 días, asigna el auxilio de transporte
        double auxTransporte = 0;
        if (nomina.getSueldoMensual() <= 2600000 && nomina.getDiasTrabajados() == 30) {
            auxTransporte = 162000;
        }
        // Establece el auxilio de transporte en la nómina
        nomina.setAuxTransporte(auxTransporte);

        // Añade el auxilio de transporte al total devengado y lo redondea a dos decimales
        totalDevengado += auxTransporte;
        totalDevengado = Math.round(totalDevengado * 100.0) / 100.0;
        // Establece el total devengado en la nómina
        nomina.setTotalDevengado(totalDevengado);

        // Calcula las deducciones por salud y pensión (4% del total devengado), redondeando a dos decimales
        double salud = Math.round(totalDevengado * 0.04 * 100.0) / 100.0;
        double pension = Math.round(totalDevengado * 0.04 * 100.0) / 100.0;

        // Calcula el fondo de solidaridad si el sueldo mensual es superior a 5.200.000, en ese caso es el 1% del total devengado
        double fondoSolidaridad = 0;
        if (nomina.getSueldoMensual() > 5200000) {
            fondoSolidaridad = Math.round(totalDevengado * 0.01 * 100.0) / 100.0;
        }
        // Establece el fondo de solidaridad en la nómina
        nomina.setFondoSolidaridad(fondoSolidaridad);

        // Calcula la retención en la fuente si el sueldo mensual es superior a 6.000.000 (1.5% del total devengado)
        double retefuente = 0;
        if (nomina.getSueldoMensual() > 6000000) {
            retefuente = Math.round(totalDevengado * 0.015 * 100.0) / 100.0;
        }
        // Establece la retención en la fuente en la nómina
        nomina.setRetefuente(retefuente);

        // Calcula la base de la nómina (total devengado) para los aportes del empleador
        double base = nomina.getTotalDevengado();
        double saludEmpleador = base * 0.085; // 8.5% para salud
        double pensionEmpleador = base * 0.12; // 12% para pensión

        // Calcula el ARL (Aseguradora de Riesgos Laborales) dependiendo del nivel
        double[] arlPorcentajes = {0.00522, 0.01044, 0.02436, 0.0435, 0.0696}; // Porcentajes de ARL según el nivel
        int nivel = nomina.getNivelArp(); // Obtiene el nivel ARP del empleado
        double arl = (nivel >= 1 && nivel <= 5) ? base * arlPorcentajes[nivel - 1] : 0; // Calcula el ARL según el nivel

        // Calcula los aportes del empleador a SENA, ICBF y Caja de Compensación
        double sena = base * 0.02; // 2% para SENA
        double icbf = base * 0.03; // 3% para ICBF
        double caja = base * 0.04; // 4% para Caja de Compensación

        // Calcula el total de costos del empleador
        double totalCosto = saludEmpleador + pensionEmpleador + arl + sena + icbf + caja;

        // Calcula las deducciones totales (salud, pensión, fondo de solidaridad, retención en la fuente) y redondea a dos decimales
        double totalDeducido = salud + pension + fondoSolidaridad + retefuente;
        nomina.setsalud(salud);
        nomina.setpension(pension);
        nomina.setTotalDeducido(Math.round(totalDeducido * 100.0) / 100.0);

        // Calcula el salario neto restando las deducciones del total devengado y lo redondea a dos decimales
        nomina.setNeto(Math.round((totalDevengado - totalDeducido) * 100.0) / 100.0);

        // Calcula las cesantías (12% del total devengado) y lo redondea a dos decimales
        double cesantias = Math.round(totalDevengado * 0.12 * 100.0) / 100.0;
        nomina.setCesantias(cesantias);

        // Calcula los intereses sobre cesantías (12% de las cesantías) y lo redondea a dos decimales
        double interesesCesantias = Math.round(cesantias * 0.12 * 100.0) / 100.0;
        nomina.setInteresesCesantias(interesesCesantias);

        // Calcula las vacaciones (4.167% del total devengado) y lo redondea a dos decimales
        double vacaciones = Math.round(totalDevengado * 0.04167 * 100.0) / 100.0;
        nomina.setVacaciones(vacaciones);

        // Calcula la prima de servicios (8.333% del total devengado) y lo redondea a dos decimales
        double primaServicios = Math.round(totalDevengado * 0.08333 * 100.0) / 100.0;
        nomina.setPrimaServicios(primaServicios);
    }
}
