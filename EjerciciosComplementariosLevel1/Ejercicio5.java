import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int num1 = 0;
        Scanner in1 = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        num1 = in1.nextInt();
        int num2 = 0;
        Scanner in2 = new Scanner(System.in);
        System.out.println("Ingrese otro número entero: ");
        num2 = in2.nextInt(); 
        in1.close();
        in2.close();
        int suma = 0;
        for (int i = 1; i <= num2; i++){
            suma = suma + num1;
            if (i == num2){
                System.out.println(String.format("%s x %s = %S", num1, num2, suma));
            }
        }
    }
}
