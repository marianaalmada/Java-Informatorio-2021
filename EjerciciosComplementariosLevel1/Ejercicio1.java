import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nombre = "";
        System.out.println("Ingrese su nombre: ");
        nombre = in.nextLine();
        in.close();
        System.out.println("HOLA " + nombre);
    }
}
