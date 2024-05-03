import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> pesquisados = new HashSet<>();
        for(Contato c : contatos) {
            if(c.getNome().startsWith(nome)) pesquisados.add(c);
        }
        return pesquisados;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato atualizado = null;
        for(Contato c : contatos) {
            if(c.getNome() == nome) {
                c.setNumero(novoNumero);
                atualizado = c;
                break;
            } 
        }
        return atualizado;
    }


}
