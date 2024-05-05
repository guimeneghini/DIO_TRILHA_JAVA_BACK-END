public class Test {
    public static void main(String[] args) throws Exception {
        
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("agua", "bebida");
        dicionario.adicionarPalavra("agua", "bebida");
        dicionario.adicionarPalavra("drink", "alcoolico");
        dicionario.adicionarPalavra("biscoito", "comida");
        dicionario.adicionarPalavra("sorvete", "sobremesa");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("agua");

        dicionario.exibirPalavras();

        System.out.println("Definicao da palavra sorvete: " + dicionario.pesquisarPorPalavra("sorvete"));

    }
}
