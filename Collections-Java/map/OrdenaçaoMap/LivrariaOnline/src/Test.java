public class Test {
    public static void main(String[] args) throws Exception {
        
        LivrariaOnline livros = new LivrariaOnline();

        livros.adicionarLivro("www.amazon", "titulo1", "autor1", 13.7);
        livros.adicionarLivro("www.saraiva", "titulo1", "autor1", 18.3);
        livros.adicionarLivro("www.google", "titulo2", "autor2", 20.5);
        livros.adicionarLivro("www.magazine", "titulo3", "autor4", 8.9);

        livros.exibirLivros();
        System.out.println("=======");

        livros.removerLivro("titulo3");

        livros.exibirLivros();
        System.out.println("=======");

        System.out.println("livros por ordem de preco:");
        livros.exibirLivrosOrdenadosPorPreco();
        System.out.println("=======");

        System.out.println("Livro mais barato: " + livros.exibirLivroMaisBarato());
        System.out.println("=======");

        System.out.println("Livro mais caro: " + livros.obterLivroMaisCaro());
        System.out.println("=======");

        System.out.println("Livros do Autor 'autor1': " + livros.pesquisarLivrosPorAutor("autor1"));
    }
}
