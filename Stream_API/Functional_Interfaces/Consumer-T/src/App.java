import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        /*
        Consumer<Integer> imprimirNumerosPar = numero -> {
            if(numero % 2 == 0) {
                System.out.println(numero); 
            }
        };
        numeros.stream().forEach(imprimirNumerosPar);
        */
        //-------------------------------------------------------
        /*
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if(n % 2 ==0) System.out.println(n);
            }
        });
        */
        //-------------------------------------------------------
        /*
        numeros.forEach(n -> {
            if(n % 2 ==0) System.out.println(n);
            }
        );
        */
        //-------------------------------------------------------
        numeros.stream()
            .filter(n -> n % 2 ==0)
            .forEach(System.out::println);

    }
        
}
