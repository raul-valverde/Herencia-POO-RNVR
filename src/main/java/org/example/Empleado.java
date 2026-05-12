package org.example;

//La super clase
public class Empleado {
  // Atributos protegidos para que sus hijos puedan verlos
    protected String nombre;
    protected double salarioBase;

    // Constructores

    public Empleado() {
    }

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase= salarioBase;
    }

    // Metodo
    public double calcularSalario() {
        return salarioBase;
    }

    public String getNombre() {
        return nombre;
    }
}
