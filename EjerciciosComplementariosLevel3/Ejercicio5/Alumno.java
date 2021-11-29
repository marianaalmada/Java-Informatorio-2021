package Ejercicio5;

import java.time.LocalDate;
import java.time.Period;


public class Alumno {
    String apellido;
    String nombre;
    LocalDate fechaDeNacimiento;

    public Alumno (String apellido, String nombre, LocalDate fechaDeNacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getApellido() {
        return apellido;
    }
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public int getEdad () {
        LocalDate añoNacimiento = this.fechaDeNacimiento;
        Period edad = Period.between(añoNacimiento, LocalDate.now());
        return edad.getYears();
    }
}
