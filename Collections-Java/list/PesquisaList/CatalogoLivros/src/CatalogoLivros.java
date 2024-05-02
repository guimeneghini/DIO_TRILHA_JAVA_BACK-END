import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!catalogo.isEmpty()){
            for(Livro l : catalogo) {
                if(l.getAutor().equalsIgnoreCase(autor)) livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!catalogo.isEmpty()){
            for(Livro l : catalogo) {
                if(l.getAnoP()>=anoInicial && l.getAnoP()<=anoFinal) livrosPorIntervalo.add(l);
            }
        }
        return livrosPorIntervalo;
    }   

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livro = null;
        if(!catalogo.isEmpty()){
            for(Livro l : catalogo) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livro = l;
                    break;
                }
            }
        }
        return livro;
    }

}
