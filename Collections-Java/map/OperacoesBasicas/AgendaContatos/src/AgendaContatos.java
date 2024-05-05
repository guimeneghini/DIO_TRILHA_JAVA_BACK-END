import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(contatos.containsKey(nome)) {
            contatos.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer num=null;
        if(contatos.containsKey(nome)) {
            num = contatos.get(nome);
        } return num;
    }
}
