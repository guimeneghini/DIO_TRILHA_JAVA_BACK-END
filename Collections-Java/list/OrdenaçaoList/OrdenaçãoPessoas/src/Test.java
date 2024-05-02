public class Test {
    public static void main(String[] args) throws Exception {
        
        OrdenacaoPessoa lista = new OrdenacaoPessoa();

        lista.adicionarPessoa("Nome 1", 44, 1.78);
        lista.adicionarPessoa("Nome 2", 15, 1.55);
        lista.adicionarPessoa("Nome 3", 32, 1.66);
        lista.adicionarPessoa("Nome 4", 25, 1.98);
        lista.adicionarPessoa("Nome 5", 17, 1.44);

        System.out.println("Lista de pessoas no estado inicial: " + lista.toString());

        System.out.println("=============");

        System.out.println("Lista de pessoas depois de ordenado por idade: " + lista.ordenarPorIdade());

        System.out.println("=============");

        System.out.println("Lista de pessoas depois de ordenado por altura: " + lista.ordenarPorAltura());

    }
}
