import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoque.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoque);
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        if(!estoque.isEmpty()){
            for(Produto p : estoque.values()){
                total += p.getPreco()*p.getQuantidade();
            }
        }
        return total;
    }

    public Produto obterProdutoMaisCaro() {
        Produto caro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoque.isEmpty()){
            for(Produto p : estoque.values()){
                if(p.getPreco() > maiorPreco) {
                    caro = p;
                    maiorPreco = p.getPreco();
                } 
            }
        }
        return caro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto barato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoque.isEmpty()){
            for(Produto p : estoque.values()){
                if(p.getPreco() < menorPreco) {
                    barato = p;
                    menorPreco = p.getPreco();
                } 
            }
        }
        return barato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0;
        if (!estoque.isEmpty()) {
          for (Map.Entry<Long, Produto> entry : estoque.entrySet()) {
            double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
            if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
              maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
              produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
            }
          }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
      }

}
