import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> alfabetico = new TreeSet<>(produtos); //TreeSet fica organizado
        //ja organizado pelo comparable
        return alfabetico;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> precificado = new TreeSet<>(new ComparatorPreco());
        precificado.addAll(produtos);
        return precificado;
    }

}
