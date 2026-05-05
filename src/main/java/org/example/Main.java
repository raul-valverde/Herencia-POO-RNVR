package org.example;

public class Main {
    public static void main(String[] args) {
        // Creamos una lista de empleados (pueden ser de cualquier tipo)
        Empleado emp1 = new EmpleadoTiempoCompleto("Hendrix", 12000.0);
        Empleado emp2 = new EmpleadoPorHoras("Chepe", 12, 20.0);

        // Java es inteligente: sabe qué fórmula usar para cada uno
        System.out.println(emp1.getNombre() + " gana: $" + emp1.calcularSalario());
        System.out.println(emp2.getNombre() + " gana: $" + emp2.calcularSalario());
    }
}