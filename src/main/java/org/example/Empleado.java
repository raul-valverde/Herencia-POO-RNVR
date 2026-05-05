package org.example;

//La super clase
public class Empleado {
  // Atributos protegidos para que sus hijos puedan verlos
    protected String nombre;
    protected double SalarioBase;

    // Constructor: Para que al nacer, el empleado ya tenga nombre y salario base

    public Empleado() {
    }

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        SalarioBase = salarioBase;
    }

    // Método general que cada hijo adaptará a su manera
    public double calcularSalario() {
        return SalarioBase;
    }

    public String getNombre() {
        return nombre;
    }
}
