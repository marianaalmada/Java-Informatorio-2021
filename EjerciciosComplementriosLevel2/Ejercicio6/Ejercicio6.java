package Ejercicio6;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio6 {
    public static void main(String[] args) {
        Empleado emple1 = new Empleado("Mariana Almada", 44085021, 8, 100);
        Empleado emple2 = new Empleado("Mauro Gonzalez", 34853610, 6, 100);
        Empleado emple3 = new Empleado("Gustavo Lopez", 24945601, 8, 100);
        Empleado emple4 = new Empleado("Mauricio Perez", 30785473, 7, 100);
        Empleado emple5 = new Empleado("Mariana Almada", 24678347, 8, 100);
        
        Set<Empleado> empleadosSet = new HashSet<>();
        empleadosSet.add(emple1);
        empleadosSet.add(emple2);
        empleadosSet.add(emple3);
        empleadosSet.add(emple4);
        empleadosSet.add(emple5);

        Map<Integer, Integer> empleadosMap = new HashMap<>();
        for (Empleado empleado : empleadosSet) {
            int sueldo = empleado.calcularSueldo(empleado.horasTrabajadas, empleado.valorPorHora);
            empleadosMap.put(empleado.dni, sueldo);
        }
        System.out.println(empleadosMap);
    }
}

