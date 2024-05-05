import java.util.Comparator;
import java.util.Map;

public class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> entry1, Map.Entry<String, Livro> entry2) {
        // Comparando os preços dos livros
        return Double.compare(entry1.getValue().getPreco(), entry2.getValue().getPreco());
    }

}
