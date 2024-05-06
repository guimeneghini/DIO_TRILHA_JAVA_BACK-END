import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean diferentes = numeros.stream()
            .distinct()
            .count() == 1;

        if(diferentes) System.out.println("Todos iguais");
        else System.out.println("Nem todos iguais");

    }
}
