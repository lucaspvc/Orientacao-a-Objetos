package org.example;
import java.util.Scanner;
public class TesteBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = cadastrarCliente(sc);

        System.out.println("Criando o cliente " + cliente.getNome() + " " + cliente.getSobrenome());

        System.out.println("Insira o valor do saldo inicial:");
        Double saldoIni = Double.valueOf(sc.next());
        Conta conta = new Conta(saldoIni);
        cliente.setConta(conta);

        boolean sair = false;
        while (!sair) {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    depositar(conta, sc);
                    break;
                case 2:
                    sacar(conta, sc);
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        System.out.println("O saldo da conta é R$ " + conta.getSaldo());
        sc.close();
    }

    //Função utilizada para o cadastro inicial do cliente
    public static Cliente cadastrarCliente(Scanner sc) {
        System.out.println("Digite o nome: ");
        String nome = sc.next();
        System.out.println("Digite o sobrenome: ");
        String sobrenome = sc.next();
        return new Cliente(nome, sobrenome);
    }

    //Função utilizada para realizar o depósito
    public static void depositar(Conta conta, Scanner sc) {
        System.out.println("Digite o valor a ser depositado:");
        Double valor = Double.valueOf(sc.next());
        conta.depositar(valor);
        System.out.println("Depósito realizado com sucesso. Novo saldo: R$ " + conta.getSaldo());
    }

    //Função utilizada para realizar o saque
    public static void sacar(Conta conta, Scanner sc) {
        System.out.println("Digite o valor a ser sacado:");
        Double valor = Double.valueOf(sc.next());
        boolean saqueRealizado = conta.sacar(valor);
        if (saqueRealizado) {
            System.out.println("Saque realizado com sucesso. Novo saldo: R$ " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}