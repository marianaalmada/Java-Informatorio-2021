import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingrese un número: ");
        num = in.nextInt();
        in.close();
        int cont = 1;
        while (cont <= num) {
            for (int i = 1; i <= cont; i++) {
                System.out.print(i);
            }
            System.out.println();
            cont++;
        }
    }
}