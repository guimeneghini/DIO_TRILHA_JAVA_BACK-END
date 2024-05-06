import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        
        Supplier<String> saudacao = () -> "Ola, seja bem vindo(a)!";

        /*
        List<String> listaSaudacoes = Stream.generate(saudacao)
            .limit(5)
            .toList();
        */

        /*
        List<String> listaSaudacoes = Stream.generate(
            new Supplier<String>() {
                @Override
                public String get() {
                    return "Ola, seja bem vindo(a)!";
                }
            }
        )
            .limit(3)
            .toList();
        */
        List<String> listaSaudacoes = Stream.generate(
            () -> "Ola, seja bem vindo(a)!")
            .limit(3)
            .toList();

        listaSaudacoes.forEach(s -> System.out.println(s));

    }
}
