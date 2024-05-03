public class Test {
    public static void main(String[] args) throws Exception {
        
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(0, "agua", 10, 4);
        produtos.adicionarProduto(1, "suco", 15, 5);
        produtos.adicionarProduto(2, "drink", 30, 2);
        produtos.adicionarProduto(3, "bebida", 20, 10);

        System.out.println("Produtos em ordem alfabetica: " + produtos.exibirProdutosPorNome());
        System.out.println("Produtos em ordem crescente de preco: " + produtos.exibirProdutosPorPreco());

    }
}
