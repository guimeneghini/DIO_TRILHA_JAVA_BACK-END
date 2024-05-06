import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> ordenado = numeros.stream()
            .distinct()
            .sorted()
            .toList();

        int tam = ordenado.size();
        int segundoMaior = ordenado.get(tam-2);
        
        System.out.println(ordenado);
        System.out.println(segundoMaior);

    }
}
