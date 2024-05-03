public class Test {
    public static void main(String[] args) throws Exception {
        
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        System.out.println("Numero de convidados: " + convidados.contarConvidados());

        convidados.adicionarConvidado("joao", 1);
        convidados.adicionarConvidado("luiza", 2);
        convidados.adicionarConvidado("joao", 3);
        convidados.adicionarConvidado("clara", 4);
        convidados.adicionarConvidado("clara", 4);

        System.out.println("Numero de convidados: " + convidados.contarConvidados());

        System.out.println("===========");

        convidados.exibirConvidados();

        convidados.removerConvidadoPorCodigoConvite(3);

        System.out.println("Numero de convidados: " + convidados.contarConvidados());

        System.out.println("===========");

        convidados.exibirConvidados();

    }
}
