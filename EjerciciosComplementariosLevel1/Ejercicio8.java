import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nom = "";
        System.out.println("Nombre y Apellido: ");
        nom = in.nextLine();
        Scanner in2 = new Scanner(System.in);
        String edad = "";
        System.out.println("Edad: ");
        edad = in2.nextLine();
        Scanner in3 = new Scanner(System.in);
        String direc = "";
        System.out.println("Dirección: ");
        direc = in3.nextLine();
        Scanner in4 = new Scanner(System.in);
        String ciudad = "";
        System.out.println("Ciudad: ");
        ciudad = in4.nextLine();
        in.close();
        in2.close();
        in3.close();
        in4.close();
        System.out.println(String.format("%s - %s - %s - %s", ciudad, direc, edad, nom));
    }
}
