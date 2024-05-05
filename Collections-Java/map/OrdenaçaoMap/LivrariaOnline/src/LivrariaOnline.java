import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {

    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        String key = null;
        if(!livros.isEmpty()){
            for(Map.Entry<String, Livro> entry : livros.entrySet()){
                if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)) key = entry.getKey();
            }
            livros.remove(key);
        }
    }

    public void exibirLivros() {
        System.out.println(livros);
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());
        livrosParaOrdenarPorPreco.sort(new ComparatorPorPreco());
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
        livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        System.out.println(livrosOrdenadosPorPreco);
    }

    public ArrayList<String> pesquisarLivrosPorAutor(String autor) {
        ArrayList<String> lista = new ArrayList<>();
        for(Livro l : livros.values()){
            if(l.getAutor().equalsIgnoreCase(autor)) lista.add(l.getTitulo());
        }
        
        return lista;
    }

    public Livro obterLivroMaisCaro() {
        Livro caro = null;
        double maior = Double.MIN_VALUE;
        for(Livro l : livros.values()){
            if(l.getPreco() > maior){
                caro = l;
                maior = l.getPreco();
            }
        }
        return caro;
    }

    public Livro exibirLivroMaisBarato() {
        Livro barato = null;
        double menor = Double.MAX_VALUE;
        for(Livro l : livros.values()){
            if(l.getPreco() < menor){
                barato = l;
                menor = l.getPreco();
            }
        }
        return barato;
    }

}
