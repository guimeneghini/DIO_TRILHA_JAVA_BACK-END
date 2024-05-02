
public class test {
    public static void main(String[] args) throws Exception {
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItens("biscoito", 2.00, 5);
        carrinho.adicionarItens("biscoito", 4.00, 3);
        carrinho.adicionarItens("arroz", 14.50, 2);
        carrinho.adicionarItens("leite", 5.70, 3);
        carrinho.adicionarItens("Doritos", 26.00, 1);

        carrinho.exibirItens();

        System.out.println("======================");

        carrinho.removerItem("biscoito");

        carrinho.exibirItens();

        System.out.println("Valor total do carrinho: " + carrinho.calcularValorTotal());

    }
}
