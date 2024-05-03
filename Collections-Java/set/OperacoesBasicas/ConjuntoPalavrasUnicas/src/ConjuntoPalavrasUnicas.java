import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }
    
    public void removerPalavra(String palavra) {
        for(String p : palavras) {
            if(p == palavra) {
                palavras.remove(p);
                break;
            }
        }
    }
    
    public boolean verificarPalavra(String palavra) {
        boolean bool = false;
        for(String p : palavras) {
            if(p == palavra) {
                bool = true;
                break;
            }
        }
        return bool;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavras);
    }

}
