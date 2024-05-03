import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> setConvidados;

    public ConjuntoConvidados() {
        this.setConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        setConvidados.add(new Convidado(nome, codigoConvite));
    }
    
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        for(Convidado c : setConvidados){
            if(c.getCodigoConvite()==codigoConvite) {
                setConvidados.remove(c);
                break;
            }
        }
    }
    
    public int contarConvidados() {
        return setConvidados.size();
    }
    
    public void exibirConvidados() {
        System.out.println(setConvidados);
    }
    
}
