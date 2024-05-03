public class Test {
    public static void main(String[] args) throws Exception {
        
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("a4", (long) 100, 9.7);
        alunos.adicionarAluno("a1", (long) 110, 10.0);
        alunos.adicionarAluno("a3", (long) 110, 10.0);
        alunos.adicionarAluno("a2", (long) 111, 5.2);

        alunos.exibirAlunos();

        alunos.exibirAlunosPorNome();

        alunos.exibirAlunosPorNota();

    }
}
