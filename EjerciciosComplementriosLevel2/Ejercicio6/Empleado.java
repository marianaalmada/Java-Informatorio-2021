package Ejercicio6;

public class Empleado {
    String nomYApe;
    int dni;
    int horasTrabajadas;
    int valorPorHora;

    public Empleado(String nomYApe, int dni, int horasTrabajadas, int valorPorHora) {
        this.nomYApe = nomYApe;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public Integer calcularSueldo (Integer horasTrabajadas, Integer valorPorHora) {
        int sueldo = horasTrabajadas * valorPorHora;
        return sueldo;
    }
}
