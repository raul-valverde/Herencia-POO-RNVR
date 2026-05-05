package org.example;

public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, int horas, double tarifa) {
        // El salario base del padre lo ponemos en 0 porque aquí mandan las horas
        super(nombre, 0);
        this.horasTrabajadas = horas;
        this.tarifaPorHora = tarifa;
    }

    @Override
    public double calcularSalario() {
        // Aquí la lógica cambia totalmente: Multiplicamos
        return horasTrabajadas * tarifaPorHora;
    }
}