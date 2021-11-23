import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

        Long palabrasConB = palabras.stream()
            .filter(palabra -> palabra.toLowerCase().startsWith("b"))
            .collect(Collectors.counting());
        
        System.out.println(palabrasConB);
    }
}
