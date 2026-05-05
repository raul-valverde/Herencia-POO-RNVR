package org.example;

// 'extends' significa que esta clase HEREDA todo de Empleado
public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto(String nombre, double salarioBase) {
        // 'super' llama al constructor del padre (Empleado)
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        // Simplemente devuelve el salario base, no hay horas extras que calcular
        return SalarioBase;
    }
}