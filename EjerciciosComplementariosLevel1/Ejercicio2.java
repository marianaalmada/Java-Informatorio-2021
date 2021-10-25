import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        int num2;
        System.out.println("Ingrese el segundo número: ");
        num2 = input2.nextInt();
        input.close();
        input2.close();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;
        System.out.println(String.format("%s + %s = %s", num1, num2, suma));
        System.out.println(String.format("%s - %s = %s", num1, num2, resta));
        System.out.println(String.format("%s * %s = %s", num1, num2, multiplicacion));
        System.out.println(String.format("%s / %s = %s", num1, num2, division));
        System.out.println(String.format("%s %% %s = %s", num1, num2, modulo));
    }
}