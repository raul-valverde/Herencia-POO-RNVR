package org.example;

//La super clase
public class Empleado {
  // Atributos protegidos para que sus hijos puedan verlos
    protected String nombre;
    protected double SalarioBase;

    // Constructores

    public Empleado() {
    }

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        SalarioBase = salarioBase;
    }

    // Metodo
    public double calcularSalario() {
        return SalarioBase;
    }

    public String getNombre() {
        return nombre;
    }
}
