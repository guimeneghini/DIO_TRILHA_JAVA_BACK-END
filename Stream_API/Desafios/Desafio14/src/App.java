import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream()
                                              .filter(num -> isPrimo(num))
                                              .max(Integer::compareTo);

        if (maiorPrimo.isPresent()) {
            System.out.println("Maior número primo da lista: " + maiorPrimo);
        } else {
            System.out.println("Não há números primos na lista.");
        }

    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
