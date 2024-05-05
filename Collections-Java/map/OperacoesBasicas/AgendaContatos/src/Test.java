public class Test {
    public static void main(String[] args) throws Exception {
        
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("Lucas", 1111);
        contatos.adicionarContato("Lucas", 2222);
        contatos.adicionarContato("Andre", 3333);
        contatos.adicionarContato("Joao", 4444);

        contatos.exibirContatos();

        contatos.removerContato("Andre");

        contatos.exibirContatos();

        System.out.println("Numero da pessoa 'Joao':  " + contatos.pesquisarPorNome("Joao"));

    }
}
