public class Test {
    public static void main(String[] args) throws Exception {
        
        OrdenacaoNumeros lista = new OrdenacaoNumeros();

        lista.adicionarNumero(3);
        lista.adicionarNumero(10);
        lista.adicionarNumero(15);
        lista.adicionarNumero(22);
        lista.adicionarNumero(1);

        System.out.println("Lista inicial: " + lista);

        System.out.println("Lista ordenada ascendente: " + lista.ordenarAscendente());

        System.out.println("Lista ordenada descendente: " + lista.ordenarDescendente());

    }
}
