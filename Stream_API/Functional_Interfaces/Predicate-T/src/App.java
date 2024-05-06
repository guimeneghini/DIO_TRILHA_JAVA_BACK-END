import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        /*
        palavras.stream()
            .filter(maisDeCincoCaracteres)
            .forEach(System.out::println);
        */

        /*
        palavras.stream()
        .filter(
            new Predicate<String>() {
                @Override
                public boolean test(String p) {
                    return p.length() > 5;
                }            
            }
        )
        .forEach(System.out::println);
        */

        palavras.stream()
            .filter(p -> p.length() > 5)
            .forEach(System.out::println);
    }
}
