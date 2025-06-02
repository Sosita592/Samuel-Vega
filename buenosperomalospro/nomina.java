// buenos pero malos
// cristian garcia, sebastian niño, diego cruz, daniel sosa, samuel vega

package com.mycompany.buenosperomalospro; // Define el paquete al que pertenece la clase

public class nomina { // Declaración de la clase 'nomina'

    // Declaración de los atributos privados de la clase 'nomina'
    private String cedula; // Atributo para almacenar la cédula del empleado
    private String nombre; // Atributo para almacenar el nombre del empleado
    private double sueldoMensual; // Atributo para almacenar el sueldo mensual del empleado
    private int diasTrabajados; // Atributo para almacenar la cantidad de días trabajados por el empleado
    private double horasExtrasDiurnas; // Atributo para almacenar las horas extras diurnas trabajadas
    private double horasExtrasNocturnas; // Atributo para almacenar las horas extras nocturnas trabajadas
    private double horasRecargoNocturno; // Atributo para almacenar el recargo nocturno por horas extras
    private int nivelArp; // Atributo para almacenar el nivel de la ARP (Aseguradora de Riesgos Profesionales)
    private double auxTransporte; // Atributo para almacenar el auxilio de transporte
    private double totalDevengado; // Atributo para almacenar el total devengado por el empleado
    private double salud; // Atributo para almacenar el monto deducido para salud
    private double pension; // Atributo para almacenar el monto deducido para pensión
    private double fondoSolidaridad; // Atributo para almacenar el fondo de solidaridad (si aplica)
    private double retefuente; // Atributo para almacenar el valor de la retención en la fuente
    private double totalDeducido; // Atributo para almacenar el total de deducciones
    private double neto; // Atributo para almacenar el salario neto después de deducciones
    private double horasExtrasDominicalesDiurnas; // Atributo para almacenar las horas extras dominicales diurnas
    private double horasExtrasDominicalesNocturnas; // Atributo para almacenar las horas extras dominicales nocturnas
    private double cesantias; // Atributo para almacenar el valor de las cesantías
    private double interesesCesantias; // Atributo para almacenar el valor de los intereses sobre cesantías
    private double vacaciones; // Atributo para almacenar el valor de las vacaciones
    private double primaServicios; // Atributo para almacenar el valor de la prima de servicios

    // Métodos getter y setter para cesantías
    public double getCesantias() { return cesantias; } // Retorna el valor de las cesantías
    public void setCesantias(double cesantias) { this.cesantias = cesantias; } // Establece el valor de las cesantías

    // Métodos getter y setter para los intereses de las cesantías
    public double getInteresesCesantias() { return interesesCesantias; } // Retorna los intereses de las cesantías
    public void setInteresesCesantias(double interesesCesantias) { this.interesesCesantias = interesesCesantias; } // Establece los intereses de las cesantías

    // Métodos getter y setter para las vacaciones
    public double getVacaciones() { return vacaciones; } // Retorna el valor de las vacaciones
    public void setVacaciones(double vacaciones) { this.vacaciones = vacaciones; } // Establece el valor de las vacaciones

    // Métodos getter y setter para la prima de servicios
    public double getPrimaServicios() { return primaServicios; } // Retorna el valor de la prima de servicios
    public void setPrimaServicios(double primaServicios) { this.primaServicios = primaServicios; } // Establece el valor de la prima de servicios

    // Métodos getter y setter para la cédula
    public String getCedula() { return cedula; } // Retorna la cédula del empleado
    public void setCedula(String cedula) { this.cedula = cedula; } // Establece la cédula del empleado

    // Métodos getter y setter para el nombre
    public String getNombre() { return nombre; } // Retorna el nombre del empleado
    public void setNombre(String nombre) { this.nombre = nombre; } // Establece el nombre del empleado

    // Métodos getter y setter para el sueldo mensual
    public double getSueldoMensual() { return sueldoMensual; } // Retorna el sueldo mensual del empleado
    public void setSueldoMensual(double sueldoMensual) { this.sueldoMensual = sueldoMensual; } // Establece el sueldo mensual del empleado

    // Métodos getter y setter para los días trabajados
    public int getDiasTrabajados() { return diasTrabajados; } // Retorna el número de días trabajados por el empleado
    public void setDiasTrabajados(int diasTrabajados) { this.diasTrabajados = diasTrabajados; } // Establece el número de días trabajados

    // Métodos getter y setter para el total devengado
    public double getTotalDevengado() { return totalDevengado; } // Retorna el total devengado por el empleado
    public void setTotalDevengado(double totalDevengado) { this.totalDevengado = totalDevengado; } // Establece el total devengado

    // Métodos getter y setter para el total deducido
    public double getTotalDeducido() { return totalDeducido; } // Retorna el total deducido de las prestaciones
    public void setTotalDeducido(double totalDeducido) { this.totalDeducido = totalDeducido; } // Establece el total deducido

    // Métodos getter y setter para el salario neto
    public double getNeto() { return neto; } // Retorna el salario neto (devengado - deducido)
    public void setNeto(double neto) { this.neto = neto; } // Establece el salario neto

    // Métodos para horas extras
    public void sethorasExtrasDiurnas(double horasExtrasDiurnas) { this.horasExtrasDiurnas = horasExtrasDiurnas; } // Establece las horas extras diurnas
    public void sethorasExtrasNocturnas(double horasExtrasNocturnas) { this.horasExtrasNocturnas = horasExtrasNocturnas; } // Establece las horas extras nocturnas
    public void sethorasRecargoNocturno(double horasRecargoNocturno) { this.horasRecargoNocturno = horasRecargoNocturno; } // Establece el recargo nocturno por horas extras
    public void setNivelArp(int nivelArp) { this.nivelArp = nivelArp; } // Establece el nivel ARP

    // Métodos getter y setter para salud y pensión
    public void setsalud(double salud) { this.salud = salud; } // Establece el monto de la deducción para salud
    public void setpension(double pension) { this.pension = pension; } // Establece el monto de la deducción para pensión

    public double getsalud() { return salud; } // Retorna el valor de la deducción para salud
    public double getpension() { return pension; } // Retorna el valor de la deducción para pensión

    // Métodos getter para horas extras y recargos nocturnos
    public double gethorasExtrasDiurnas() { return horasExtrasDiurnas; } // Retorna las horas extras diurnas
    public double gethorasExtrasNocturnas() { return horasExtrasNocturnas; } // Retorna las horas extras nocturnas
    public double getHorasRecargoNocturno() { return horasRecargoNocturno; } // Retorna el recargo nocturno por horas extras

    // Métodos getter y setter para horas extras dominicales
    public double getHorasExtrasDominicalesDiurnas() { return horasExtrasDominicalesDiurnas; } // Retorna las horas extras dominicales diurnas
    public void setHorasExtrasDominicalesDiurnas(double horas) { this.horasExtrasDominicalesDiurnas = horas; } // Establece las horas extras dominicales diurnas

    public double getHorasExtrasDominicalesNocturnas() { return horasExtrasDominicalesNocturnas; } // Retorna las horas extras dominicales nocturnas
    public void setHorasExtrasDominicalesNocturnas(double horas) { this.horasExtrasDominicalesNocturnas = horas; } // Establece las horas extras dominicales nocturnas

    // Métodos getter y setter para auxilio de transporte
    public double getAuxTransporte() { return auxTransporte; } // Retorna el valor del auxilio de transporte
    public void setAuxTransporte(double auxTransporte) { this.auxTransporte = auxTransporte; } // Establece el valor del auxilio de transporte

    // Métodos getter y setter para fondo de solidaridad
    public double getFondoSolidaridad() { return fondoSolidaridad; } // Retorna el valor del fondo de solidaridad
    public void setFondoSolidaridad(double fondoSolidaridad) { this.fondoSolidaridad = fondoSolidaridad; } // Establece el valor del fondo de solidaridad

    // Métodos getter y setter para retención en la fuente
    public double getRetefuente() { return retefuente; } // Retorna el valor de la retención en la fuente
    public void setRetefuente(double retefuente) { this.retefuente = retefuente; } // Establece el valor de la retención en la fuente

    // Método getter para el nivel ARP
    public int getNivelArp() { return nivelArp; } // Retorna el nivel de la ARP
}

