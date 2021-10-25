import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 0;
        System.out.println("Ingrese un número entero: ");
        numero = in.nextInt();
        in.close();
        int number = 1;
        for (int i = 1; i <= numero; i++){
            number = number * i;
            if (i == numero ) {
                System.out.println(String.format("El factorial de %s es: %s", numero, number));
            }
        }
    }
}
