package org.example;

public class Main {
    public static void main(String[] args) {
        // Creamos una lista de empleados
        Empleado emp1 = new EmpleadoTiempoCompleto("Hendrix", 12000.0);
        Empleado emp2 = new EmpleadoPorHoras("Chepe", 12, 20.0);


        System.out.println(emp1.getNombre() + " gana: $" + emp1.calcularSalario() + " cordobas al mes.");
        System.out.println(emp2.getNombre() + " gana: $" + emp2.calcularSalario() + " cordobas al dia.");
        System.out.println(emp2.getNombre() + " por mes gana " + emp2.calcularSalario()*31+" Cordobas.");
    }
}