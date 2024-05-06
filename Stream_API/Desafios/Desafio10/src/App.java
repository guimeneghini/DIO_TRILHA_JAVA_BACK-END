import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosMultiplos3e5 = numeros.stream()
            .distinct()
            .filter(n -> n % 3 == 0 || n % 5 == 0)
            .toList();

        System.out.println(numerosMultiplos3e5);

    }
}
