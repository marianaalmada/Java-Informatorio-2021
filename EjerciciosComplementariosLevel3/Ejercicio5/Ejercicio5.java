package Ejercicio5;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Suarez", "Matias", LocalDate.of(2000, 04, 13));
        Alumno alumno2 = new Alumno("Sonia", "Alvarez", LocalDate.of(2000, 05, 07));
        Alumno alumno3 = new Alumno("Emma", "Chamberlain", LocalDate.of(1999, 02, 25));
        Alumno alumno4 = new Alumno("Rita", "Rodriguez", LocalDate.of(2000, 11, 14));
        Alumno alumno5 = new Alumno("Pedro", "Torres", LocalDate.of(1998, 04, 04));

        List<Alumno> alumnos = List.of(alumno1, alumno2, alumno3, alumno4, alumno5); 

        Map<String, Integer> alumnosMap = alumnos.stream()
            .collect(Collectors.toMap(alumno -> alumno.getApellido() + " " + alumno.getNombre(), 
            alumno -> alumno.getEdad()));

        System.out.println(alumnosMap);
    }
}
