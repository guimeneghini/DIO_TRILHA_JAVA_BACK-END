public class Test {
    public static void main(String[] args) {
        
        SomaNumeros lista = new SomaNumeros();

        lista.adicionarNumero(4);
        lista.adicionarNumero(10);
        lista.adicionarNumero(1);
        lista.adicionarNumero(3);

        System.out.println("A soma dos numeros na lista: " + lista.calcularSoma());

        System.out.println("O menor numero da lista: " + lista.encontrarMenorNumero());

        System.out.println("O maior numero da lista: " + lista.encontrarMaiorNumero());

        lista.exibirNumeros();

    }
}
