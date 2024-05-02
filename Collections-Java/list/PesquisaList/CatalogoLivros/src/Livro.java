public class Livro {

    private String titulo;
    private String autor;
    private int anoP;

    public Livro(String titulo, String autor, int anoP) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoP = anoP;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoP() {
        return anoP;
    }

    public void setAnoP(int anoP) {
        this.anoP = anoP;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", anoP=" + anoP + "\n";
    }

}