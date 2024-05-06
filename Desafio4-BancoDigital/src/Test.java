public class Test {
    public static void main(String[] args) throws Exception {
        
        Conta cc =  new Corrente(new Cliente("Joao"));
        Conta cp = new Poupanca(new Cliente("Andre"));

        cc.depositar(200);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        Banco banco = new Banco("Santander");

        banco.adicionarContas(cp);
        banco.adicionarContas(cc);

        banco.exibirContaMaisSaldo();
        banco.exibirContaMenosSaldo();

        banco.contarContas();

        banco.exibirContas();

    }
}
