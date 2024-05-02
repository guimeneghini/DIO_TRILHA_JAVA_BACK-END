import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {

    private List<Integer> lista;

    public OrdenacaoNumeros() {
        this.lista = new ArrayList<>();
    }

    @Override
    public int compareTo(Integer o) {
        return Integer.compare(this.lista.size(), o);
    }

    public void adicionarNumero(int numero) {
        lista.add(numero);
    }
    
    public List<Integer> ordenarAscendente() {
        List<Integer> ascendente = new ArrayList<>(lista);
        Collections.sort(ascendente);
        return ascendente;
    }
    
    public List<Integer> ordenarDescendente() {
        List<Integer> descendente = new ArrayList<>(lista);
        Collections.sort(descendente, Collections.reverseOrder());
        return descendente;
    }

    @Override
    public String toString() {
        return "lista=" + lista;
    }
    
}