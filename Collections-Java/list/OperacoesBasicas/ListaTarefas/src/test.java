public class test {
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Numero total de tarefas no ArrayList: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");

        System.out.println("Numero total de tarefas no ArrayList: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.adicionarTarefa("tarefa 2");
        listaTarefa.adicionarTarefa("tarefa 2");

        System.out.println("Numero total de tarefas no ArrayList: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.removerTarefa("tarefa 1");

        System.out.println("Numero total de tarefas no ArrayList: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.obterDescricaoTarefas();
    }
}
