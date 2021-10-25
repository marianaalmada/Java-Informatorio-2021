import java.util.ArrayList;
import java.util.List;
public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>();
        alumnos.add("Abigail Sanchez");
        alumnos.add("Fabian Cardozo");
        alumnos.add("Mariana Almada");
        alumnos.add("Jose Castro");
        alumnos.add("Camila Soto");
        alumnos.add("Pedro Juarez");
        alumnos.add("Natalia Suarez");
        alumnos.add("Juan Cardozo");
        alumnos.add("Antonella Pelozo");
        alumnos.add("Lurdes Fernandez");
        alumnos.add("Jose Alvarez");
        alumnos.add("Cesar Carbajal");
        List<String> cursoA = new ArrayList<>();
        cursoA = alumnos.subList(0, 4);
        List<String> cursoB = new ArrayList<>();
        cursoB = alumnos.subList(4, 8);
        List<String> cursoC = new ArrayList<>();
        cursoC = alumnos.subList(8, 12);
        System.out.println(cursoA);
        System.out.println(cursoB);
        System.out.println(cursoC);
    }
}
