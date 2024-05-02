import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItens(String nome, double preco, int qtd) {
        Item i = new Item(nome, preco, qtd);
        listaItens.add(i);
    }

    public void removerItem(String nome) {
        List<Item> itensRemocao = new ArrayList<>();
        for(Item i : listaItens) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itensRemocao.add(i);
            }
        }
        listaItens.removeAll(itensRemocao);
    }

    public double calcularValorTotal() {
        double total = 0;
        for(Item i : listaItens) {
            total += i.getPreco()*i.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(listaItens);
    }

}
