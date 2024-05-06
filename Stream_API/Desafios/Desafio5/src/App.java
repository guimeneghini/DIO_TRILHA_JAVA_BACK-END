import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream()
            .filter(n -> n > 5)
            .mapToDouble(num -> num)
            .average();

        if(media.isPresent()) System.out.println(media);
        else System.out.println("Nao ha numeros maiores que 5");

    }
}
