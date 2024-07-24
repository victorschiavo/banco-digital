import Banco.Cliente;
import Banco.ContaCorrente;
import Banco.ContaPoupanca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        ContaCorrente contaC = new ContaCorrente(cliente);
        ContaPoupanca contaP = new ContaPoupanca(cliente);

        System.out.println("=========================");
        System.out.println("Bem vindo(a)!");
        System.out.print("Por favor, informe o seu nome: ");
        cliente.setNome(sc.next());
        System.out.println("=========================");
        System.out.print("Digite o valor que deseja depositar: ");
        contaC.depositar(sc.nextDouble());
        System.out.println("=========================");
        System.out.print("Agora, digite o valor que deseja transferir: ");
        contaC.transferir(sc.nextDouble(), contaP);
        System.out.println("=========================");

        contaC.extrato();
        contaP.extrato();
        System.out.println("=========================");
    }
}