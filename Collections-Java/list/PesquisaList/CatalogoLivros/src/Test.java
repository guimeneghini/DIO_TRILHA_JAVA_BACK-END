public class Test {
    public static void main(String[] args) {
        
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogo.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println("Os livros do Autor 2 são: " + catalogo.pesquisarPorAutor("Autor 2"));
        System.out.println("===============");
        System.out.println("Livros entre os anos 2020 e 2022: " + catalogo.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println("===============");
        System.out.println("Informações do livro 1: " + catalogo.pesquisarPorTitulo("Livro 1"));

    }
}

