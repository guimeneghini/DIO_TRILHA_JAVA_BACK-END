public class Test {
    public static void main(String[] args) throws Exception {
        
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("agua");
        palavras.adicionarPalavra("suco");
        palavras.adicionarPalavra("drink");
        palavras.adicionarPalavra("drink"); //nao foi adicionado
        palavras.adicionarPalavra("bebida");

        palavras.exibirPalavrasUnicas();

        palavras.removerPalavra("agua");

        palavras.exibirPalavrasUnicas();

        if(palavras.verificarPalavra("suco")) System.out.println("A palavra esta contida no conjunto.");
        else System.out.println("A palavra nao esta contida no conjunto.");

    }
}
