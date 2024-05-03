import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void  removerAluno(long matricula) {
        for(Aluno a : alunos) {
            if(a.getMatricula() == matricula) {
                alunos.remove(a);
                break;
            }
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alfabetico = new TreeSet<>(alunos);
        System.out.println("Alunos em ordem alfabetica: " + alfabetico);
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> notaCrescente = new TreeSet<>(new ComparatorNota());
        notaCrescente.addAll(alunos);
        System.out.println("Alunos em ordem crescente de nota: " + notaCrescente);
    }

    public void exibirAlunos() {
        System.out.println(alunos);
    }

}
