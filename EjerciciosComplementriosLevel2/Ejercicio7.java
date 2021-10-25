import java.util.ArrayList;
import java.util.List;
public class Ejercicio7 {
    public static void main(String[] args) {
        List<String> fizzBuzz = new ArrayList<>();
        fizzBuzz = fizzBuzzFuntion(1, 8);
        System.out.println(fizzBuzz);
    }

    public static List<String> fizzBuzzFuntion(int num1, int num2) {
        List<String> listNumeros = new ArrayList<>();
        for(int i = num1; i < num2; i++){
            String secNum = String.valueOf(i);
            listNumeros.add(secNum);
            System.out.println(secNum);
            if (i % 2 == 0 && i % 3 == 0){
                listNumeros.remove(secNum);
                listNumeros.add("FizzBuzz");
            } else if (i % 2 == 0) {
                listNumeros.remove(secNum);
                listNumeros.add("Fizz");
            } else if (i % 3 == 0) {
                listNumeros.remove(secNum);
                listNumeros.add("Buzz");
            }
        } 
        return listNumeros;
    }
}
