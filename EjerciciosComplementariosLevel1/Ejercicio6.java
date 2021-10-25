import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        System.out.println("Ingrese un número entero: ");
        num1 = in.nextInt();
        Scanner in_ = new Scanner(System.in);
        int num2 = 0;    
        System.out.println("Ingrese otro número entero: ");
        num2 = in_.nextInt();
        in.close();
        in_.close();
        int resultado = 1;
        for(int i = 1; i <= num2; i++) {
            resultado = resultado * num1;
            System.out.println(num1);
            if (i == num2) {
                System.out.println(String.format("%s elevado a %s = %s", num1, num2, resultado));
            }
        }
    }
}
