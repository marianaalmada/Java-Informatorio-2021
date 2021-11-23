import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);

        List<Integer> numerosFactorial = numeros.stream()
            .map(numero -> factorial(numero))
            .distinct()
            .collect(Collectors.toList());

        System.out.print(numerosFactorial);
    }

    public static Integer factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    } 
}
