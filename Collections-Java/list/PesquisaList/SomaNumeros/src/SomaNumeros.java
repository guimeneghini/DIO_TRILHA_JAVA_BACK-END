import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> lista;

    public SomaNumeros() {
        this.lista = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        lista.add(numero);
    }
    
    public int calcularSoma() {
        int total = 0;
        for(int num : lista){
            total += num;
        }
        return total;
    }
    
    public int encontrarMaiorNumero() {
        int maior = lista.get(0);
        for(int num : lista){
            if(num > maior) maior=num;
        }
        return maior;
    }
    
    public int encontrarMenorNumero() {
        int menor = lista.get(0);
        for(int num : lista){
            if(num < menor) menor=num;
        }
        return menor;
    }
    
    public void exibirNumeros() {
        System.out.println(lista);
    }

    @Override
    public String toString() {
        return "SomaNumeros [lista=" + lista + "]";
    }

}
