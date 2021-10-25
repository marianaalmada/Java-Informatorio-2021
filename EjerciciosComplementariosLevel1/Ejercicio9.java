import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String texto = "";
        System.out.println("Ingrese texto: ");
        texto = in.nextLine();
        Scanner input = new Scanner(System.in);
        char letra;
        System.out.println("Ingrese una letra: ");
        letra = input.next().charAt(0);
        in.close();
        input.close();
        char[] coincidencias = texto.toCharArray();
        int acum = 0;
        for (char letter : coincidencias) {
            if (letra == letter) {
                acum = acum + 1;
            }
        }
        System.out.println(acum);    
    }
}
