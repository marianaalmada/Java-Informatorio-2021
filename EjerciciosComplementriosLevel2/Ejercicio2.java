import java.util.ArrayList;
import java.util.List;
public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(6);
        numeros.add(2);
        numeros.add(8);
        numeros.add(5);
        List<Integer> numerosAgregados = new ArrayList<>(); 
        numerosAgregados.addAll(numeros);
        numerosAgregados.add(0, 11);
        numerosAgregados.add(6, 7);
        for (Integer numero : numerosAgregados){
            System.out.println(numero);
        }
        System.out.println("Tamaño antes: " + numeros.size());
        System.out.println("Tamaño después: " + numerosAgregados.size());
    }
}
