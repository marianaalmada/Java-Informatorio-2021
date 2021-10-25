import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String texto;
        System.out.print("Ingresar texto: ");
        texto = input.nextLine();
        input.close();
        char[] texoChar = texto.toCharArray();
        for (int i = 0; i < texoChar.length; i++) {
            if (texoChar[i] >= 'a' && texoChar[i] <= 'z') {
                texoChar[i] = (char) ((int) texoChar[i] - 32);
            }
        }
        for (int i = 0; i < texoChar.length; i++) {
            System.out.print(texoChar[i]);
        }
    }
}
