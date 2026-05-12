package org.example;

// 'extends' = que hereda_todo de empleado
public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(String nombre, double salarioBase) {
        // 'super' llama al constructor del padre (Empleado)
        super(nombre, salarioBase);
    }

    //Override es que esta clase va asobreescribir sobre un metodo de su clase padre.
    @Override
    public double calcularSalario() {
        // Simplemente devuelve el salario base, no hay horas extras que calcular
        return SalarioBase;
    }
}