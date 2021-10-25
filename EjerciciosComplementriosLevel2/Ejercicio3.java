import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Ejercicio3{
    public static void main(String[] args) {
        List<Integer> cartasNum = new ArrayList<>();
        cartasNum.add(1);
        cartasNum.add(2);
        cartasNum.add(3);
        cartasNum.add(4);
        cartasNum.add(5);
        cartasNum.add(6);
        cartasNum.add(7);
        cartasNum.add(8);
        cartasNum.add(9);
        cartasNum.add(10);
        System.out.println(cartasNum);
        Collections.reverse(cartasNum);
        System.out.println(cartasNum);
        Collections.shuffle(cartasNum);
        System.out.println(cartasNum);
    }
}