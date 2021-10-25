import java.util.ArrayList;
import java.util.List;
public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        List<Integer> valorPorHora = new ArrayList<>();
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);
        List<Integer> totalDia = new ArrayList<>();
        int cont = 0;
        for (Integer total : valorPorHora) {
            total = total * horasTrabajadas.get(cont);
            totalDia.add(total);
            cont = cont + 1;
        }
        System.out.println(totalDia);
        int suma = 0;
        for (Integer cant : totalDia) {
           suma = suma + cant; 
        }
        System.out.println("Total Final: $ " + suma);
    }
}
