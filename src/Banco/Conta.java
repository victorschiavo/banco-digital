package Banco;

public abstract class Conta {

    private static final int AGENCIA_PADRAO = 2306;
    private static int SEQUENCIAL = 1;

    // Atributos
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    // Métodos
    public void depositar(double valor) {
        System.out.println("> Depositando valor...");
        saldo += valor;
        System.out.println(valor + "$ Depositado com sucesso!");
    }
    public void sacar(double valor) {
        System.out.println("> Sacando valor...");
        saldo -= valor;
        System.out.println(valor + "$ Sacado com sucesso!");
    }
    public void transferir(double valor, Conta contaDestino) {
        System.out.println("> Transferindo valor...");
        saldo -= valor;
        contaDestino.depositar(valor);
        System.out.println(valor + "$ Transferido com sucesso!");
    }
    protected void imprimirExtrato() {
        System.out.printf("| Títular: %s", this.cliente.getNome());
        System.out.printf(" | Agência: %d", this.agencia);
        System.out.printf(" | Banco.Conta: %d", this.numero);
        System.out.printf(" | Saldo: %.2f", this.saldo);
        System.out.println(" |");
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
}