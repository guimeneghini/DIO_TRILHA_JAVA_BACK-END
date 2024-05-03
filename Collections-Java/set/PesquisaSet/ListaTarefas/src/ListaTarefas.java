import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for(Tarefa t : tarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) tarefas.remove(t);
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefas);
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidas = new HashSet<>();
        for(Tarefa t : tarefas){
            if(t.isExecutada() == true) concluidas.add(t);
        }
        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentes = new HashSet<>();
        for(Tarefa t : tarefas){
            if(t.isExecutada() == false) pendentes.add(t);
        }
        return pendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa t : tarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setExecutada(true);
                break;
            }
        }
    }

    public void  marcarTarefaPendente(String descricao) {
        for(Tarefa t : tarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setExecutada(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        tarefas.clear();
    }

}
