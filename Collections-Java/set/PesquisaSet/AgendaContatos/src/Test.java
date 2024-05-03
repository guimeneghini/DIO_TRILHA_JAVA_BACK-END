public class Test {
    public static void main(String[] args) throws Exception {
        
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("maria luiza", 100);
        contatos.adicionarContato("maria luiza", 150); //nao foi adicionado
        contatos.adicionarContato("ana", 200);
        contatos.adicionarContato("maria clara", 200);
        contatos.adicionarContato("maria julia", 250);
        contatos.adicionarContato("ana clara", 300);

        contatos.exibirContatos();
        System.out.println("============");

        System.out.println("Contato dos nomes 'maria': " + contatos.pesquisarPorNome("maria"));

        System.out.println("============");

        System.out.println("Dados atualizados do contato 'ana': \n" + contatos.atualizarNumeroContato("ana", 555));
    }
}
