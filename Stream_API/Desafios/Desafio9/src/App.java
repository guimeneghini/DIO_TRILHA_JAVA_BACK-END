import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean saoDistintos = numeros.stream()
            .distinct()
            .count() == numeros.size();

        if (saoDistintos) System.out.println("Todos os números são distintos (não se repetem) na lista.");
        else System.out.println("Existem números repetidos na lista.");

    }
}
