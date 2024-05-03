public class Test {
    public static void main(String[] args) throws Exception {
        
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("varrer");
        tarefas.adicionarTarefa("varrer"); //nao adicionado
        tarefas.adicionarTarefa("cozinhar");
        tarefas.adicionarTarefa("passar");
        tarefas.adicionarTarefa("lavar");

        tarefas.exibirTarefas();

        System.out.println("O numero de tarefas: " + tarefas.contarTarefas());

        tarefas.removerTarefa("varrer");

        tarefas.exibirTarefas();

        tarefas.marcarTarefaConcluida("cozinhar");
        tarefas.marcarTarefaConcluida("passar");

        System.out.println("Tarefas feitas: " + tarefas.obterTarefasConcluidas());
        System.out.println("Tarefas nao feitas: " + tarefas.obterTarefasPendentes());
        
        tarefas.marcarTarefaPendente("passar");

        tarefas.exibirTarefas();

        tarefas.limparListaTarefas();

        tarefas.exibirTarefas();
    }
}
