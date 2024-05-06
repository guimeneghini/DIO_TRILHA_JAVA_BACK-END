import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        /*
        int resultado = numeros.stream()
            .reduce(0, somar);
        */

        /*
        int resultado = numeros.stream()
            .reduce(0, new BinaryOperator<Integer>() {
                @Override
                public Integer apply(Integer num1, Integer num2) {
                    return num1 + num2;
                }  
            });
        */

        int resultado = numeros.stream()
            .reduce(0, (num1, num2) -> num1 + num2);

        System.out.println("A soma dos numeros: " + resultado);

    }
}
