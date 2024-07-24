package Banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void extrato() {
        System.out.println(">>> Extrato Banco.Conta Corrente");
        super.imprimirExtrato();
    }
}