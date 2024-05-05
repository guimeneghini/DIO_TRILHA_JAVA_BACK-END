public class Test {
    public static void main(String[] args) throws Exception {
        
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1111, "agua", 10, 1);
        estoque.adicionarProduto(2222, "drink", 5, 10);
        estoque.adicionarProduto(3333, "costela", 3, 30);
        estoque.adicionarProduto(4444, "bacon", 7, 8);
        estoque.adicionarProduto(1111, "agua", 10, 1);

        estoque.exibirProdutos();

        System.out.println("Valor total no estoque: " + estoque.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());

        System.out.println("Produto com maior valor geral no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
