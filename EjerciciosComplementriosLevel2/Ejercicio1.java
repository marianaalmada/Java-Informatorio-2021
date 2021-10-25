import java.util.ArrayList;
import java.util.List;
public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> ciudadesFavoritas = new ArrayList<>();
        ciudadesFavoritas.add("Buenos Aires");
        ciudadesFavoritas.add("Formosa");
        ciudadesFavoritas.add("Corrientes");
        System.out.println("#1 - " + ciudadesFavoritas.get(0));
        System.out.println("#2 - " + ciudadesFavoritas.get(1));
        System.out.println("#3 - " + ciudadesFavoritas.get(2));
    }
}
