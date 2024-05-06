import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> intervalo = numeros.stream()
            .filter(n -> n > 5 && n < 10)
            .toList();

        System.out.println(intervalo);

    }
}
