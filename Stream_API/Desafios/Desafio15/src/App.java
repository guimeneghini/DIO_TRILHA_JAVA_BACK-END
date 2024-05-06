import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean negativo = numeros.stream()
            .filter(n -> n < 0)
            .count() > 0;

        if(negativo) System.out.println("Ha numero(s) negativo");
        else System.out.println("Nao ha numero(s) negativo");
    }
}
