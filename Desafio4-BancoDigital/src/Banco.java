import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionarContas(Conta c) {
        contas.add(c);
    }

    public void exibirContas() {
        System.out.println("CONTAS DO BANCO: " + this.nome);
        for(Conta c : contas) {
            System.out.println(c);
            System.out.println("--------");
        }
    }

    public void contarContas() {
        System.out.println("O banco " + this.nome + " tem " + contas.size() + " conta(s)");
    }

    public void exibirContaMaisSaldo() {
        Conta rico = null;
        double maior = Double.MIN_VALUE;
        System.out.println("===Conta com mais saldo do banco: " + this.nome + "===");
        if(this.contas.isEmpty()) System.out.println("Nenhuma");
        else {
            for(Conta c : contas) {
                if(c.saldo > maior) {
                    maior = c.saldo;
                    rico = c;
                }
            }
        } System.out.println(rico);
    }

    public void exibirContaMenosSaldo() {
        Conta pobre = null;
        double menor = Double.MAX_VALUE;
        System.out.println("===Conta com menos saldo do banco: " + this.nome + "===");
        if(this.contas.isEmpty()) System.out.println("Nenhuma");
        else {
            for(Conta c : contas) {
                if(c.saldo < menor) {
                    menor = c.saldo;
                    pobre = c;
                }
            }
        } System.out.println(pobre);
    }

    
}
